Imports MySql.Data.MySqlClient

Public Class Ahorro

    Dim conexion As New MySqlConnection
    Dim comandos As New MySqlCommand
    Dim datos As New DataSet
    Dim adaptador As New MySqlDataAdapter
    Private Sub Ahorro_Load(sender As Object, e As EventArgs) Handles MyBase.Load
        Try

            conexion.ConnectionString = "server = sql.freedb.tech; port = 3306 ; user = freedb_Anselmo22; password =r5J96H?r3NzcH!3 ; database = freedb_gestion_dinero"
            'conexion.ConnectionString = "server = localhost; user = root; password = ; database = gestion_hogar"
            conexion.Open()
        Catch ex As Exception

            MsgBox(ex.Message)
        End Try
    End Sub

    Private Sub Button1_Click(sender As Object, e As EventArgs) Handles Button1.Click
        Try
            If INS_AHORROS.Text = "" Then
                MsgBox("Por favor, complete todos los campos.")
            Else
                Dim cantidad As Double
                If Double.TryParse(INS_AHORROS.Text, cantidad) Then
                    Dim comandos As New MySqlCommand("INSERT INTO `ahorros`(Cantidad, Fecha) VALUES (@cantidad, @fecha)", conexion)
                    comandos.Parameters.AddWithValue("@cantidad", cantidad)
                    Dim fecha As DateTime = DateTime.Now
                    comandos.Parameters.AddWithValue("@fecha", fecha)
                    comandos.ExecuteNonQuery()
                    MsgBox("INGRESO EXITOSO")
                    INS_AHORROS.Clear()

                Else
                    MsgBox("Formato de cantidad inválido. Por favor, ingrese un número válido.")
                End If
            End If
        Catch ex As Exception
            MsgBox(ex.Message)
        End Try
    End Sub

    Private Sub Retornar_Click(sender As Object, e As EventArgs) Handles Retornar.Click
        Dim formularioDestino As New Menu_Principal()
        formularioDestino.Show()
        Me.Hide()
    End Sub
End Class