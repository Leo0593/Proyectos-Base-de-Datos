Imports MySql.Data.MySqlClient

Public Class Form1

    Dim conexion As New MySqlConnection
    Dim comandos As New MySqlCommand
    Dim datos As New DataSet
    Dim adaptador As New MySqlDataAdapter


    Private Sub Form1_Load(sender As Object, e As EventArgs) Handles MyBase.Load

        Try

            conexion.ConnectionString = "server = localhost; user = root; password = ; database = alimentos"
            conexion.Open()
            MsgBox("CONECTADO")

        Catch ex As Exception

            MsgBox(ex.Message)

        End Try

    End Sub

    Private Sub Button1_Click(sender As Object, e As EventArgs) Handles Button1.Click

        Try
            comandos = New MySqlCommand("INSERT INTO `productos`(codigo, nombre, precio, cantidad)" & Chr(13) & "VALUES (@codigo, @nombre, @precio, @cantidad)", conexion)
            comandos.Parameters.AddWithValue("@codigo", TX_CODIGO.Text)
            comandos.Parameters.AddWithValue("@nombre", TX_NOMBRE.Text)
            comandos.Parameters.AddWithValue("@precio", TX_PRECIO.Text)
            comandos.Parameters.AddWithValue("@cantidad", TX_CANTIDAD.Text)
            comandos.ExecuteNonQuery()
            MsgBox("INGRESO EXITOSO")

        Catch ex As Exception

            MsgBox(ex.Message)

        End Try

    End Sub

    Private Sub Button2_Click(sender As Object, e As EventArgs) Handles Button2.Click

        Dim consulta As String
        Dim lista As Byte

        If TX_CONSULTA.Text <> "" Then
            consulta = "SELECT * FROM productos WHERE codigo = '" & TX_CONSULTA.Text & "'"
            adaptador = New MySqlDataAdapter(consulta, conexion)
            datos = New DataSet
            adaptador.Fill(datos, "productos")
            lista = datos.Tables("productos").Rows.Count
        End If

        If lista <> 0 Then
            C_CODIGO.Text = datos.Tables("productos").Rows(0).Item("codigo")
            C_NOMBRE.Text = datos.Tables("productos").Rows(0).Item("nombre")
            C_PRECIO.Text = datos.Tables("productos").Rows(0).Item("precio")
            C_CANTIDAD.Text = datos.Tables("productos").Rows(0).Item("cantidad")
        Else
            MessageBox.Show("No se encontraron resultados para la consulta.")
        End If

    End Sub

    Private Sub Button3_Click(sender As Object, e As EventArgs) Handles Button3.Click

        Dim consulta As String
        Dim lista As Byte

        consulta = "SELECT * FROM productos"
        adaptador = New MySqlDataAdapter(consulta, conexion)
        datos = New DataSet
        adaptador.Fill(datos, "productos")
        lista = datos.Tables("productos").Rows.Count

        If lista <> 0 Then
            Contenedor.DataSource = datos
            Contenedor.DataMember = "productos"
        Else
            MessageBox.Show("No se encontraron resultados para la consulta.")
        End If

    End Sub

    Private Sub Button4_Click(sender As Object, e As EventArgs) Handles Button4.Click
        Dim eliminar As String
        Dim si As Byte

        si = MsgBox("DESEA ELIMINAR ?", vbYesNo, "Eliminar")

        If si = 6 Then
            eliminar = "DELETE from productos WHERE codigo = '" & TX_CONSULTA.Text & "'"
            comandos = New MySqlCommand(eliminar, conexion)
            comandos.ExecuteNonQuery()
            MsgBox("ELIMINADO")
            C_CODIGO.Clear()
            C_CANTIDAD.Clear()
            C_NOMBRE.Clear()
            C_PRECIO.Clear()
            TX_CONSULTA.Clear()
        End If


    End Sub

    Private Sub Button5_Click(sender As Object, e As EventArgs) Handles Button5.Click
        Dim modificar As String
        modificar = "UPDATE productos set codigo = '" & TX_CODIGO.Text & "', nombre = '" & TX_NOMBRE.Text & "',precio = '" & TX_PRECIO.Text & "', cantidad ='" & TX_CANTIDAD.Text & "' WHERE codigo = " & TX_CODIGO.Text & ""
        comandos = New MySqlCommand(modificar, conexion)
        Dim cant As Integer
        cant = comandos.ExecuteNonQuery

        If cant = 1 Then
            TX_CODIGO.Clear()
            TX_NOMBRE.Clear()
            TX_PRECIO.Clear()
            TX_CANTIDAD.Clear()
            MessageBox.Show("SE A MODIFICADO LA TABLA")
        Else
            MessageBox.Show("NO EXISTE ESE CODIGO")
        End If

    End Sub


End Class
