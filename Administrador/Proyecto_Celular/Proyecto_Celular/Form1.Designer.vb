<Global.Microsoft.VisualBasic.CompilerServices.DesignerGenerated()>
Partial Class Form1
    Inherits System.Windows.Forms.Form

    'Form reemplaza a Dispose para limpiar la lista de componentes.
    <System.Diagnostics.DebuggerNonUserCode()>
    Protected Overrides Sub Dispose(ByVal disposing As Boolean)
        Try
            If disposing AndAlso components IsNot Nothing Then
                components.Dispose()
            End If
        Finally
            MyBase.Dispose(disposing)
        End Try
    End Sub

    'Requerido por el Diseñador de Windows Forms
    Private components As System.ComponentModel.IContainer

    'NOTA: el Diseñador de Windows Forms necesita el siguiente procedimiento
    'Se puede modificar usando el Diseñador de Windows Forms.  
    'No lo modifique con el editor de código.
    <System.Diagnostics.DebuggerStepThrough()>
    Private Sub InitializeComponent()
        Me.Label2 = New System.Windows.Forms.Label()
        Me.Label3 = New System.Windows.Forms.Label()
        Me.Label4 = New System.Windows.Forms.Label()
        Me.Label5 = New System.Windows.Forms.Label()
        Me.TX_CODIGO = New System.Windows.Forms.TextBox()
        Me.TX_NOMBRE = New System.Windows.Forms.TextBox()
        Me.TX_PRECIO = New System.Windows.Forms.TextBox()
        Me.TX_CANTIDAD = New System.Windows.Forms.TextBox()
        Me.Button1 = New System.Windows.Forms.Button()
        Me.Label6 = New System.Windows.Forms.Label()
        Me.TX_CONSULTA = New System.Windows.Forms.TextBox()
        Me.Button2 = New System.Windows.Forms.Button()
        Me.Label7 = New System.Windows.Forms.Label()
        Me.Label8 = New System.Windows.Forms.Label()
        Me.Label9 = New System.Windows.Forms.Label()
        Me.Label10 = New System.Windows.Forms.Label()
        Me.C_CODIGO = New System.Windows.Forms.TextBox()
        Me.C_NOMBRE = New System.Windows.Forms.TextBox()
        Me.C_PRECIO = New System.Windows.Forms.TextBox()
        Me.C_CANTIDAD = New System.Windows.Forms.TextBox()
        Me.Contenedor = New System.Windows.Forms.DataGridView()
        Me.Button3 = New System.Windows.Forms.Button()
        Me.Label11 = New System.Windows.Forms.Label()
        Me.Button4 = New System.Windows.Forms.Button()
        Me.Button5 = New System.Windows.Forms.Button()
        CType(Me.Contenedor, System.ComponentModel.ISupportInitialize).BeginInit()
        Me.SuspendLayout()
        '
        'Label2
        '
        Me.Label2.AutoSize = True
        Me.Label2.Location = New System.Drawing.Point(52, 83)
        Me.Label2.Name = "Label2"
        Me.Label2.Size = New System.Drawing.Size(49, 13)
        Me.Label2.TabIndex = 1
        Me.Label2.Text = "CODIGO"
        '
        'Label3
        '
        Me.Label3.AutoSize = True
        Me.Label3.Location = New System.Drawing.Point(52, 113)
        Me.Label3.Name = "Label3"
        Me.Label3.Size = New System.Drawing.Size(54, 13)
        Me.Label3.TabIndex = 2
        Me.Label3.Text = "NOMBRE"
        '
        'Label4
        '
        Me.Label4.AutoSize = True
        Me.Label4.Location = New System.Drawing.Point(52, 144)
        Me.Label4.Name = "Label4"
        Me.Label4.Size = New System.Drawing.Size(47, 13)
        Me.Label4.TabIndex = 3
        Me.Label4.Text = "PRECIO"
        '
        'Label5
        '
        Me.Label5.AutoSize = True
        Me.Label5.Location = New System.Drawing.Point(52, 171)
        Me.Label5.Name = "Label5"
        Me.Label5.Size = New System.Drawing.Size(62, 13)
        Me.Label5.TabIndex = 4
        Me.Label5.Text = "CANTIDAD"
        '
        'TX_CODIGO
        '
        Me.TX_CODIGO.Location = New System.Drawing.Point(125, 80)
        Me.TX_CODIGO.Name = "TX_CODIGO"
        Me.TX_CODIGO.Size = New System.Drawing.Size(130, 20)
        Me.TX_CODIGO.TabIndex = 5
        '
        'TX_NOMBRE
        '
        Me.TX_NOMBRE.Location = New System.Drawing.Point(125, 109)
        Me.TX_NOMBRE.Name = "TX_NOMBRE"
        Me.TX_NOMBRE.Size = New System.Drawing.Size(130, 20)
        Me.TX_NOMBRE.TabIndex = 6
        '
        'TX_PRECIO
        '
        Me.TX_PRECIO.Location = New System.Drawing.Point(125, 139)
        Me.TX_PRECIO.Name = "TX_PRECIO"
        Me.TX_PRECIO.Size = New System.Drawing.Size(130, 20)
        Me.TX_PRECIO.TabIndex = 7
        '
        'TX_CANTIDAD
        '
        Me.TX_CANTIDAD.Location = New System.Drawing.Point(125, 168)
        Me.TX_CANTIDAD.Name = "TX_CANTIDAD"
        Me.TX_CANTIDAD.Size = New System.Drawing.Size(130, 20)
        Me.TX_CANTIDAD.TabIndex = 8
        '
        'Button1
        '
        Me.Button1.Location = New System.Drawing.Point(61, 208)
        Me.Button1.Name = "Button1"
        Me.Button1.Size = New System.Drawing.Size(75, 23)
        Me.Button1.TabIndex = 9
        Me.Button1.Text = "INSERTAR"
        Me.Button1.UseVisualStyleBackColor = True
        '
        'Label6
        '
        Me.Label6.AutoSize = True
        Me.Label6.Location = New System.Drawing.Point(677, 87)
        Me.Label6.Name = "Label6"
        Me.Label6.Size = New System.Drawing.Size(137, 13)
        Me.Label6.TabIndex = 10
        Me.Label6.Text = "CONSULTAR ESPECIFICA"
        '
        'TX_CONSULTA
        '
        Me.TX_CONSULTA.Location = New System.Drawing.Point(627, 116)
        Me.TX_CONSULTA.Name = "TX_CONSULTA"
        Me.TX_CONSULTA.Size = New System.Drawing.Size(141, 20)
        Me.TX_CONSULTA.TabIndex = 11
        '
        'Button2
        '
        Me.Button2.Location = New System.Drawing.Point(784, 114)
        Me.Button2.Name = "Button2"
        Me.Button2.Size = New System.Drawing.Size(75, 23)
        Me.Button2.TabIndex = 12
        Me.Button2.Text = "BUSCAR"
        Me.Button2.UseVisualStyleBackColor = True
        '
        'Label7
        '
        Me.Label7.AutoSize = True
        Me.Label7.Location = New System.Drawing.Point(639, 156)
        Me.Label7.Name = "Label7"
        Me.Label7.Size = New System.Drawing.Size(49, 13)
        Me.Label7.TabIndex = 13
        Me.Label7.Text = "CODIGO"
        '
        'Label8
        '
        Me.Label8.AutoSize = True
        Me.Label8.Location = New System.Drawing.Point(638, 182)
        Me.Label8.Name = "Label8"
        Me.Label8.Size = New System.Drawing.Size(54, 13)
        Me.Label8.TabIndex = 14
        Me.Label8.Text = "NOMBRE"
        '
        'Label9
        '
        Me.Label9.AutoSize = True
        Me.Label9.Location = New System.Drawing.Point(641, 208)
        Me.Label9.Name = "Label9"
        Me.Label9.Size = New System.Drawing.Size(47, 13)
        Me.Label9.TabIndex = 15
        Me.Label9.Text = "PRECIO"
        '
        'Label10
        '
        Me.Label10.AutoSize = True
        Me.Label10.Location = New System.Drawing.Point(635, 233)
        Me.Label10.Name = "Label10"
        Me.Label10.Size = New System.Drawing.Size(62, 13)
        Me.Label10.TabIndex = 16
        Me.Label10.Text = "CANTIDAD"
        '
        'C_CODIGO
        '
        Me.C_CODIGO.Location = New System.Drawing.Point(705, 152)
        Me.C_CODIGO.Name = "C_CODIGO"
        Me.C_CODIGO.Size = New System.Drawing.Size(114, 20)
        Me.C_CODIGO.TabIndex = 17
        '
        'C_NOMBRE
        '
        Me.C_NOMBRE.Location = New System.Drawing.Point(705, 177)
        Me.C_NOMBRE.Name = "C_NOMBRE"
        Me.C_NOMBRE.Size = New System.Drawing.Size(114, 20)
        Me.C_NOMBRE.TabIndex = 18
        '
        'C_PRECIO
        '
        Me.C_PRECIO.Location = New System.Drawing.Point(705, 203)
        Me.C_PRECIO.Name = "C_PRECIO"
        Me.C_PRECIO.Size = New System.Drawing.Size(114, 20)
        Me.C_PRECIO.TabIndex = 19
        '
        'C_CANTIDAD
        '
        Me.C_CANTIDAD.Location = New System.Drawing.Point(705, 229)
        Me.C_CANTIDAD.Name = "C_CANTIDAD"
        Me.C_CANTIDAD.Size = New System.Drawing.Size(114, 20)
        Me.C_CANTIDAD.TabIndex = 20
        '
        'Contenedor
        '
        Me.Contenedor.ColumnHeadersHeightSizeMode = System.Windows.Forms.DataGridViewColumnHeadersHeightSizeMode.AutoSize
        Me.Contenedor.Location = New System.Drawing.Point(277, 38)
        Me.Contenedor.Name = "Contenedor"
        Me.Contenedor.Size = New System.Drawing.Size(335, 325)
        Me.Contenedor.TabIndex = 21
        '
        'Button3
        '
        Me.Button3.Location = New System.Drawing.Point(602, 9)
        Me.Button3.Name = "Button3"
        Me.Button3.Size = New System.Drawing.Size(118, 23)
        Me.Button3.TabIndex = 22
        Me.Button3.Text = "MOSTRAR DATOS"
        Me.Button3.UseVisualStyleBackColor = True
        '
        'Label11
        '
        Me.Label11.AutoSize = True
        Me.Label11.Font = New System.Drawing.Font("Rockwell", 20.25!, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.Label11.Location = New System.Drawing.Point(287, 2)
        Me.Label11.Name = "Label11"
        Me.Label11.Size = New System.Drawing.Size(309, 33)
        Me.Label11.TabIndex = 23
        Me.Label11.Text = "CONSULTA GENERAL"
        '
        'Button4
        '
        Me.Button4.Location = New System.Drawing.Point(680, 270)
        Me.Button4.Name = "Button4"
        Me.Button4.Size = New System.Drawing.Size(107, 27)
        Me.Button4.TabIndex = 24
        Me.Button4.Text = "ELIMINAR"
        Me.Button4.UseVisualStyleBackColor = True
        '
        'Button5
        '
        Me.Button5.Location = New System.Drawing.Point(159, 208)
        Me.Button5.Name = "Button5"
        Me.Button5.Size = New System.Drawing.Size(75, 23)
        Me.Button5.TabIndex = 25
        Me.Button5.Text = "MODIFICAR"
        Me.Button5.TextAlign = System.Drawing.ContentAlignment.MiddleRight
        Me.Button5.UseVisualStyleBackColor = True
        '
        'Form1
        '
        Me.AutoScaleDimensions = New System.Drawing.SizeF(6.0!, 13.0!)
        Me.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font
        Me.ClientSize = New System.Drawing.Size(1158, 533)
        Me.Controls.Add(Me.Button5)
        Me.Controls.Add(Me.Button4)
        Me.Controls.Add(Me.Label11)
        Me.Controls.Add(Me.Button3)
        Me.Controls.Add(Me.Contenedor)
        Me.Controls.Add(Me.C_CANTIDAD)
        Me.Controls.Add(Me.C_PRECIO)
        Me.Controls.Add(Me.C_NOMBRE)
        Me.Controls.Add(Me.C_CODIGO)
        Me.Controls.Add(Me.Label10)
        Me.Controls.Add(Me.Label9)
        Me.Controls.Add(Me.Label8)
        Me.Controls.Add(Me.Label7)
        Me.Controls.Add(Me.Button2)
        Me.Controls.Add(Me.TX_CONSULTA)
        Me.Controls.Add(Me.Label6)
        Me.Controls.Add(Me.Button1)
        Me.Controls.Add(Me.TX_CANTIDAD)
        Me.Controls.Add(Me.TX_PRECIO)
        Me.Controls.Add(Me.TX_NOMBRE)
        Me.Controls.Add(Me.TX_CODIGO)
        Me.Controls.Add(Me.Label5)
        Me.Controls.Add(Me.Label4)
        Me.Controls.Add(Me.Label3)
        Me.Controls.Add(Me.Label2)
        Me.Name = "Form1"
        Me.Text = "Form1"
        CType(Me.Contenedor, System.ComponentModel.ISupportInitialize).EndInit()
        Me.ResumeLayout(False)
        Me.PerformLayout()

    End Sub
    Friend WithEvents Label2 As Label
    Friend WithEvents Label3 As Label
    Friend WithEvents Label4 As Label
    Friend WithEvents Label5 As Label
    Friend WithEvents TX_CODIGO As TextBox
    Friend WithEvents TX_NOMBRE As TextBox
    Friend WithEvents TX_PRECIO As TextBox
    Friend WithEvents TX_CANTIDAD As TextBox
    Friend WithEvents Button1 As Button
    Friend WithEvents Label6 As Label
    Friend WithEvents TX_CONSULTA As TextBox
    Friend WithEvents Button2 As Button
    Friend WithEvents Label7 As Label
    Friend WithEvents Label8 As Label
    Friend WithEvents Label9 As Label
    Friend WithEvents Label10 As Label
    Friend WithEvents C_CODIGO As TextBox
    Friend WithEvents C_NOMBRE As TextBox
    Friend WithEvents C_PRECIO As TextBox
    Friend WithEvents C_CANTIDAD As TextBox
    Friend WithEvents Contenedor As DataGridView
    Friend WithEvents Button3 As Button
    Friend WithEvents Label11 As Label
    Friend WithEvents Button4 As Button
    Friend WithEvents Button5 As Button
End Class
