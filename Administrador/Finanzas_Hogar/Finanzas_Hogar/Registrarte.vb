Imports MySql.Data.MySqlClient

Public Class Registrarte
    Dim conexion As New MySqlConnection
    Dim comandos As New MySqlCommand
    Dim datos As New DataSet
    Dim adaptador As New MySqlDataAdapter
    Private Sub Registrarte_Load(sender As Object, e As EventArgs) Handles MyBase.Load
        Try
            conexion.ConnectionString = "server = sql.freedb.tech; port = 3306 ; user = freedb_Anselmo22; password =r5J96H?r3NzcH!3 ; database = freedb_gestion_dinero"
            'conexion.ConnectionString = "server = localhost; user = root; password = ; database = gestion_hogar"
            conexion.Open()
        Catch ex As Exception

            MsgBox(ex.Message)

        End Try
    End Sub

    Private Sub REGISTRAR_Click(sender As Object, e As EventArgs) Handles REGISTRAR.Click

        Try
            If INS_NOMBRE.Text = "" Or INS_APELLIDO.Text = "" Or INS_TELEFONO.Text = "" Or INS_EMAIL.Text = "" Or INS_USUARIO.Text = "" Or INS_CONTRASEÑA.Text = "" Then
                MsgBox("Por favor, complete todos los campos.")
            Else
                Dim comandos As New MySqlCommand("INSERT INTO `usuario`(Nombre, Apellido, Telefono, Email, Nombre_Usuario, Contraseña) VALUES (@nombre, @apellido, @telefono, @email, @usuario, @contraseña)", conexion)
                comandos.Parameters.AddWithValue("@nombre", INS_NOMBRE.Text)
                comandos.Parameters.AddWithValue("@apellido", INS_APELLIDO.Text)
                comandos.Parameters.AddWithValue("@telefono", INS_TELEFONO.Text)
                comandos.Parameters.AddWithValue("@email", INS_EMAIL.Text)
                comandos.Parameters.AddWithValue("@usuario", INS_USUARIO.Text)
                comandos.Parameters.AddWithValue("@contraseña", INS_CONTRASEÑA.Text)
                comandos.ExecuteNonQuery()
                MsgBox("INGRESO EXITOSO")
                Dim nuevoFormulario As New Inicio_Sesion()
                nuevoFormulario.Show()
                Me.Hide()
                INS_NOMBRE.Clear()
                INS_APELLIDO.Clear()
                INS_TELEFONO.Clear()
                INS_EMAIL.Clear()
                INS_USUARIO.Clear()
                INS_CONTRASEÑA.Clear()
            End If
        Catch ex As Exception

            MsgBox(ex.Message)

        End Try

    End Sub

    Private Sub Retornar_Click(sender As Object, e As EventArgs) Handles Retornar.Click
        Dim formularioDestino As New Inicio_Sesion()
        formularioDestino.Show()
        Me.Hide()
    End Sub
End Class