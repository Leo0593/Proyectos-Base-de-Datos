Imports MySql.Data.MySqlClient

Public Class Menu_Principal
    Dim conexion As New MySqlConnection
    Dim comandos As New MySqlCommand
    Dim datos As New DataSet
    Dim adaptador As New MySqlDataAdapter
    Private fechaSeleccionada As Date
    Private Sub Menu_Principal_Load(sender As Object, e As EventArgs) Handles MyBase.Load
        Try

            conexion.ConnectionString = "server = sql.freedb.tech; port = 3306 ; user = freedb_Anselmo22; password =r5J96H?r3NzcH!3 ; database = freedb_gestion_dinero"
            'conexion.ConnectionString = "server = localhost; user = root; password = ; database = gestion_hogar"
            conexion.Open()
        Catch ex As Exception

            MsgBox(ex.Message)
        End Try

    End Sub

    Private Sub BOTON_INGRESOS_Click(sender As Object, e As EventArgs) Handles BOTON_INGRESOS.Click
        Dim formularioDestino As New Ingresos()
        formularioDestino.Show()
        Me.Hide()
    End Sub

    Private Sub BOTON_GASTOS_Click(sender As Object, e As EventArgs) Handles BOTON_GASTOS.Click
        Dim formularioDestino As New Gastos()
        formularioDestino.Show()
        Me.Hide()
    End Sub

    Private Sub BOTON_AHORROS_Click(sender As Object, e As EventArgs) Handles BOTON_AHORROS.Click
        Dim formularioDestino As New Ahorro()
        formularioDestino.Show()
        Me.Hide()
    End Sub

    Private Sub Button1_Click(sender As Object, e As EventArgs) Handles MOSTRAR_GASTOS.Click

        Dim consulta As String
        Dim lista As Byte

        consulta = "SELECT * FROM gastos__fijos
                    UNION
                    SELECT * FROM gastos__varaibles;"
        adaptador = New MySqlDataAdapter(consulta, conexion)
        datos = New DataSet
        adaptador.Fill(datos, "gastos")
        lista = datos.Tables("gastos").Rows.Count

        If lista <> 0 Then
            Pantalla.DataSource = datos
            Pantalla.DataMember = "gastos"
        Else
            MessageBox.Show("No se encontraron resultados para la consulta.")
        End If

    End Sub

    Private Sub Button2_Click(sender As Object, e As EventArgs) Handles Button2.Click
        Dim consulta As String
        Dim lista As Byte

        consulta = "SELECT * FROM gastos__fijos WHERE Fecha = '" & fechaSeleccionada.ToString("yyyy-MM-dd") & "'"
        adaptador = New MySqlDataAdapter(consulta, conexion)
        datos = New DataSet
        adaptador.Fill(datos, "gastos")
        lista = datos.Tables("gastos").Rows.Count

        If lista <> 0 Then
            Pantalla.DataSource = datos
            Pantalla.DataMember = "gastos"
        Else
            MessageBox.Show("No se encontraron resultados para la consulta.")
        End If
    End Sub

    Private Sub DateTimePicker1_ValueChanged(sender As Object, e As EventArgs) Handles DateTimeExp.ValueChanged
        fechaSeleccionada = DateTimeExp.Value
    End Sub

    Private Sub Button3_Click(sender As Object, e As EventArgs) Handles Button3.Click
        Dim consulta As String
        Dim lista As Byte

        consulta = "SELECT * FROM ingresos__variables
                    UNION
                    SELECT * FROM ingresos__fijos;"
        adaptador = New MySqlDataAdapter(consulta, conexion)
        datos = New DataSet
        adaptador.Fill(datos, "ingresos")
        lista = datos.Tables("ingresos").Rows.Count

        If lista <> 0 Then
            Pantalla.DataSource = datos
            Pantalla.DataMember = "ingresos"
        Else
            MessageBox.Show("No se encontraron resultados para la consulta.")
        End If


    End Sub

    Private Sub Totales_Click(sender As Object, e As EventArgs) Handles Totales.Click
        Dim consulta As String
        Dim consultaAhorros As String

        Try
            consulta = "SELECT 
            (SELECT SUM(Cantidad) FROM gastos__varaibles) AS GastosVariables, 
            (SELECT SUM(Cantidad) FROM gastos__fijos) AS GastosFijos, 
            (SELECT SUM(Cantidad) FROM ingresos__variables) AS IngresosVariables, 
            (SELECT SUM(Cantidad) FROM ingresos__fijos) AS IngresosFijos;"

            consultaAhorros = "SELECT Cantidad FROM ahorros ORDER BY id DESC LIMIT 1;"

            adaptador = New MySqlDataAdapter(consulta, conexion)
            datos = New DataSet
            adaptador.Fill(datos, "Totales")

            Dim adaptadorAhorros As New MySqlDataAdapter(consultaAhorros, conexion)
            Dim datosAhorros As New DataSet
            adaptadorAhorros.Fill(datosAhorros, "Ahorros")

            If datos.Tables(0).Rows.Count > 0 Then
                Dim gastosVariables As Decimal = If(IsDBNull(datos.Tables(0).Rows(0).Item("GastosVariables")), 0D, Convert.ToDecimal(datos.Tables(0).Rows(0).Item("GastosVariables")))
                Dim gastosFijos As Decimal = If(IsDBNull(datos.Tables(0).Rows(0).Item("GastosFijos")), 0D, Convert.ToDecimal(datos.Tables(0).Rows(0).Item("GastosFijos")))
                Dim ingresosVariables As Decimal = If(IsDBNull(datos.Tables(0).Rows(0).Item("IngresosVariables")), 0D, Convert.ToDecimal(datos.Tables(0).Rows(0).Item("IngresosVariables")))
                Dim ingresosFijos As Decimal = If(IsDBNull(datos.Tables(0).Rows(0).Item("IngresosFijos")), 0D, Convert.ToDecimal(datos.Tables(0).Rows(0).Item("IngresosFijos")))

                Dim gastosTotales As Decimal = gastosVariables + gastosFijos
                Dim ingresosTotales As Decimal = ingresosVariables + ingresosFijos

                Gastos_Totales.Text = gastosTotales.ToString()
                Ingresos_Totales.Text = ingresosTotales.ToString()

                Dim reciduo As Decimal = ingresosTotales - gastosTotales

                Dim ultimoAhorro As Decimal = 0D
                If datosAhorros.Tables(0).Rows.Count > 0 Then
                    ultimoAhorro = Convert.ToDecimal(datosAhorros.Tables(0).Rows(0).Item("Cantidad"))
                End If

                Dim porcentajeAhorro As Decimal = 0D
                If reciduo > 0 Then
                    porcentajeAhorro = (ultimoAhorro * reciduo) / 100
                End If

                Ahorro.Text = porcentajeAhorro.ToString("F2")
                Dim reciduofianl As Decimal = reciduo - porcentajeAhorro
                Sobrante.Text = reciduofianl.ToString()

            Else
                Gastos_Totales.Text = "0"
                Ingresos_Totales.Text = "0"
                Sobrante.Text = "0"
                Ahorro.Text = "0"
            End If

        Catch ex As Exception
            MessageBox.Show("Error: " & ex.Message)
        End Try
    End Sub
End Class