Imports MySql.Data.MySqlClient

Public Class Inicio_Sesion
    Dim conexion As New MySqlConnection
    Dim comandos As New MySqlCommand
    Dim datos As New DataSet
    Dim adaptador As New MySqlDataAdapter
    Private Sub Form1_Load(sender As Object, e As EventArgs) Handles MyBase.Load
        Try
            conexion.ConnectionString = "server = sql.freedb.tech; port = 3306 ; user = freedb_Anselmo22; password =r5J96H?r3NzcH!3 ; database = freedb_gestion_dinero"
            'conexion.ConnectionString = "server = localhost; user = root; password = ; database = gestion_hogar"
            conexion.Open()
            MsgBox("CONECTADO")

        Catch ex As Exception

            MsgBox(ex.Message)

        End Try
    End Sub

    Private Sub Button1_Click(sender As Object, e As EventArgs) Handles Button1.Click
        Dim consulta As String

        If BUS_USUARIO.Text <> "" AndAlso BUS_CONTRASEÑA.Text <> "" Then
            consulta = "SELECT * FROM usuario WHERE Nombre_Usuario = '" & BUS_USUARIO.Text & "' AND Contraseña = '" & BUS_CONTRASEÑA.Text & "'"
            adaptador = New MySqlDataAdapter(consulta, conexion)
            datos = New DataSet
            adaptador.Fill(datos, "usuario")
            If datos.Tables("usuario").Rows.Count > 0 Then
                Dim nuevoFormulario As New Menu_Principal()
                nuevoFormulario.Show()
                Me.Hide()
            Else
                MessageBox.Show("Nombre de usuario o contraseña incorrectos")
            End If
        Else
            MessageBox.Show("Por favor ingrese un nombre de usuario y contraseña")
        End If

        BUS_USUARIO.Clear()
        BUS_CONTRASEÑA.Clear()
    End Sub

    Private Sub Button2_Click(sender As Object, e As EventArgs) Handles Button2.Click

        Dim formularioDestino As New Registrarte()
        formularioDestino.Show()
        Me.Hide()
    End Sub


End Class
