<Global.Microsoft.VisualBasic.CompilerServices.DesignerGenerated()>
Partial Class Gastos
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
        Dim resources As System.ComponentModel.ComponentResourceManager = New System.ComponentModel.ComponentResourceManager(GetType(Gastos))
        Me.Button2 = New System.Windows.Forms.Button()
        Me.Label1 = New System.Windows.Forms.Label()
        Me.INS_DESCRIPCION = New System.Windows.Forms.TextBox()
        Me.INS_CANTIDAD = New System.Windows.Forms.TextBox()
        Me.Label2 = New System.Windows.Forms.Label()
        Me.Panel1 = New System.Windows.Forms.Panel()
        Me.Retornar = New System.Windows.Forms.Button()
        Me.Label5 = New System.Windows.Forms.Label()
        Me.Panel2 = New System.Windows.Forms.Panel()
        Me.Label7 = New System.Windows.Forms.Label()
        Me.Label3 = New System.Windows.Forms.Label()
        Me.Panel3 = New System.Windows.Forms.Panel()
        Me.Button1 = New System.Windows.Forms.Button()
        Me.Label6 = New System.Windows.Forms.Label()
        Me.Panel4 = New System.Windows.Forms.Panel()
        Me.Panel1.SuspendLayout()
        Me.Panel2.SuspendLayout()
        Me.Panel3.SuspendLayout()
        Me.Panel4.SuspendLayout()
        Me.SuspendLayout()
        '
        'Button2
        '
        Me.Button2.BackgroundImage = CType(resources.GetObject("Button2.BackgroundImage"), System.Drawing.Image)
        Me.Button2.BackgroundImageLayout = System.Windows.Forms.ImageLayout.Zoom
        Me.Button2.FlatAppearance.BorderSize = 0
        Me.Button2.FlatStyle = System.Windows.Forms.FlatStyle.Flat
        Me.Button2.Location = New System.Drawing.Point(1, 47)
        Me.Button2.Name = "Button2"
        Me.Button2.Size = New System.Drawing.Size(108, 98)
        Me.Button2.TabIndex = 1
        Me.Button2.UseVisualStyleBackColor = True
        '
        'Label1
        '
        Me.Label1.AutoSize = True
        Me.Label1.Font = New System.Drawing.Font("Perpetua", 15.0!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.Label1.Location = New System.Drawing.Point(27, 16)
        Me.Label1.Name = "Label1"
        Me.Label1.Size = New System.Drawing.Size(101, 23)
        Me.Label1.TabIndex = 3
        Me.Label1.Text = "CANTIDAD"
        '
        'INS_DESCRIPCION
        '
        Me.INS_DESCRIPCION.Location = New System.Drawing.Point(149, 49)
        Me.INS_DESCRIPCION.Name = "INS_DESCRIPCION"
        Me.INS_DESCRIPCION.Size = New System.Drawing.Size(298, 20)
        Me.INS_DESCRIPCION.TabIndex = 4
        '
        'INS_CANTIDAD
        '
        Me.INS_CANTIDAD.Location = New System.Drawing.Point(149, 16)
        Me.INS_CANTIDAD.Name = "INS_CANTIDAD"
        Me.INS_CANTIDAD.Size = New System.Drawing.Size(137, 20)
        Me.INS_CANTIDAD.TabIndex = 6
        '
        'Label2
        '
        Me.Label2.AutoSize = True
        Me.Label2.Font = New System.Drawing.Font("Perpetua", 15.0!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.Label2.Location = New System.Drawing.Point(18, 49)
        Me.Label2.Name = "Label2"
        Me.Label2.Size = New System.Drawing.Size(125, 23)
        Me.Label2.TabIndex = 7
        Me.Label2.Text = "DESCRIPCIÓN"
        '
        'Panel1
        '
        Me.Panel1.BackColor = System.Drawing.Color.Gainsboro
        Me.Panel1.Controls.Add(Me.Label2)
        Me.Panel1.Controls.Add(Me.INS_CANTIDAD)
        Me.Panel1.Controls.Add(Me.INS_DESCRIPCION)
        Me.Panel1.Controls.Add(Me.Label1)
        Me.Panel1.Location = New System.Drawing.Point(39, 86)
        Me.Panel1.Name = "Panel1"
        Me.Panel1.Size = New System.Drawing.Size(472, 85)
        Me.Panel1.TabIndex = 9
        '
        'Retornar
        '
        Me.Retornar.BackColor = System.Drawing.Color.Transparent
        Me.Retornar.BackgroundImage = CType(resources.GetObject("Retornar.BackgroundImage"), System.Drawing.Image)
        Me.Retornar.BackgroundImageLayout = System.Windows.Forms.ImageLayout.Zoom
        Me.Retornar.FlatAppearance.BorderSize = 0
        Me.Retornar.FlatStyle = System.Windows.Forms.FlatStyle.Flat
        Me.Retornar.Location = New System.Drawing.Point(2, 2)
        Me.Retornar.Name = "Retornar"
        Me.Retornar.Size = New System.Drawing.Size(43, 38)
        Me.Retornar.TabIndex = 2
        Me.Retornar.UseVisualStyleBackColor = False
        '
        'Label5
        '
        Me.Label5.AutoSize = True
        Me.Label5.Font = New System.Drawing.Font("Perpetua", 15.0!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.Label5.Location = New System.Drawing.Point(5, 3)
        Me.Label5.Name = "Label5"
        Me.Label5.Size = New System.Drawing.Size(101, 46)
        Me.Label5.TabIndex = 12
        Me.Label5.Text = "GASTOS " & Global.Microsoft.VisualBasic.ChrW(13) & Global.Microsoft.VisualBasic.ChrW(10) & "VARIABLES"
        Me.Label5.TextAlign = System.Drawing.ContentAlignment.MiddleCenter
        '
        'Panel2
        '
        Me.Panel2.BackColor = System.Drawing.Color.Gainsboro
        Me.Panel2.Controls.Add(Me.Button2)
        Me.Panel2.Controls.Add(Me.Label5)
        Me.Panel2.Location = New System.Drawing.Point(193, 38)
        Me.Panel2.Name = "Panel2"
        Me.Panel2.Size = New System.Drawing.Size(112, 148)
        Me.Panel2.TabIndex = 13
        '
        'Label7
        '
        Me.Label7.AutoSize = True
        Me.Label7.BackColor = System.Drawing.Color.Transparent
        Me.Label7.Font = New System.Drawing.Font("Perpetua", 25.0!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.Label7.Location = New System.Drawing.Point(93, 5)
        Me.Label7.Name = "Label7"
        Me.Label7.Size = New System.Drawing.Size(347, 78)
        Me.Label7.TabIndex = 15
        Me.Label7.Text = "BIENVENIDO AL PANEL" & Global.Microsoft.VisualBasic.ChrW(13) & Global.Microsoft.VisualBasic.ChrW(10) & "DE GASTOS" & Global.Microsoft.VisualBasic.ChrW(13) & Global.Microsoft.VisualBasic.ChrW(10)
        Me.Label7.TextAlign = System.Drawing.ContentAlignment.MiddleCenter
        '
        'Label3
        '
        Me.Label3.AutoSize = True
        Me.Label3.BackColor = System.Drawing.Color.Transparent
        Me.Label3.Font = New System.Drawing.Font("Perpetua", 15.0!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.Label3.Location = New System.Drawing.Point(84, 9)
        Me.Label3.Name = "Label3"
        Me.Label3.Size = New System.Drawing.Size(161, 23)
        Me.Label3.TabIndex = 16
        Me.Label3.Text = "SELECCIONE EL TI"
        Me.Label3.TextAlign = System.Drawing.ContentAlignment.MiddleCenter
        '
        'Panel3
        '
        Me.Panel3.BackColor = System.Drawing.Color.Gainsboro
        Me.Panel3.Controls.Add(Me.Button1)
        Me.Panel3.Controls.Add(Me.Label6)
        Me.Panel3.Location = New System.Drawing.Point(31, 38)
        Me.Panel3.Name = "Panel3"
        Me.Panel3.Size = New System.Drawing.Size(112, 148)
        Me.Panel3.TabIndex = 14
        '
        'Button1
        '
        Me.Button1.BackgroundImage = CType(resources.GetObject("Button1.BackgroundImage"), System.Drawing.Image)
        Me.Button1.BackgroundImageLayout = System.Windows.Forms.ImageLayout.Zoom
        Me.Button1.FlatAppearance.BorderSize = 0
        Me.Button1.FlatStyle = System.Windows.Forms.FlatStyle.Flat
        Me.Button1.Location = New System.Drawing.Point(3, 52)
        Me.Button1.Name = "Button1"
        Me.Button1.Size = New System.Drawing.Size(106, 86)
        Me.Button1.TabIndex = 0
        Me.Button1.UseVisualStyleBackColor = True
        '
        'Label6
        '
        Me.Label6.AutoSize = True
        Me.Label6.Font = New System.Drawing.Font("Perpetua", 15.0!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.Label6.Location = New System.Drawing.Point(13, 3)
        Me.Label6.Name = "Label6"
        Me.Label6.Size = New System.Drawing.Size(82, 46)
        Me.Label6.TabIndex = 12
        Me.Label6.Text = "GASTOS " & Global.Microsoft.VisualBasic.ChrW(13) & Global.Microsoft.VisualBasic.ChrW(10) & "FIJOS" & Global.Microsoft.VisualBasic.ChrW(13) & Global.Microsoft.VisualBasic.ChrW(10)
        Me.Label6.TextAlign = System.Drawing.ContentAlignment.MiddleCenter
        '
        'Panel4
        '
        Me.Panel4.Controls.Add(Me.Panel2)
        Me.Panel4.Controls.Add(Me.Label3)
        Me.Panel4.Controls.Add(Me.Panel3)
        Me.Panel4.Location = New System.Drawing.Point(100, 189)
        Me.Panel4.Name = "Panel4"
        Me.Panel4.Size = New System.Drawing.Size(340, 200)
        Me.Panel4.TabIndex = 17
        '
        'Gastos
        '
        Me.AutoScaleDimensions = New System.Drawing.SizeF(6.0!, 13.0!)
        Me.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font
        Me.BackColor = System.Drawing.SystemColors.ActiveCaption
        Me.BackgroundImage = CType(resources.GetObject("$this.BackgroundImage"), System.Drawing.Image)
        Me.BackgroundImageLayout = System.Windows.Forms.ImageLayout.Stretch
        Me.ClientSize = New System.Drawing.Size(566, 413)
        Me.Controls.Add(Me.Panel4)
        Me.Controls.Add(Me.Label7)
        Me.Controls.Add(Me.Panel1)
        Me.Controls.Add(Me.Retornar)
        Me.Name = "Gastos"
        Me.Text = "Gastos"
        Me.Panel1.ResumeLayout(False)
        Me.Panel1.PerformLayout()
        Me.Panel2.ResumeLayout(False)
        Me.Panel2.PerformLayout()
        Me.Panel3.ResumeLayout(False)
        Me.Panel3.PerformLayout()
        Me.Panel4.ResumeLayout(False)
        Me.Panel4.PerformLayout()
        Me.ResumeLayout(False)
        Me.PerformLayout()

    End Sub
    Friend WithEvents Button2 As Button
    Friend WithEvents Label1 As Label
    Friend WithEvents INS_DESCRIPCION As TextBox
    Friend WithEvents INS_CANTIDAD As TextBox
    Friend WithEvents Label2 As Label
    Friend WithEvents Panel1 As Panel
    Friend WithEvents Retornar As Button
    Friend WithEvents Label5 As Label
    Friend WithEvents Panel2 As Panel
    Friend WithEvents Label7 As Label
    Friend WithEvents Label3 As Label
    Friend WithEvents Panel3 As Panel
    Friend WithEvents Button1 As Button
    Friend WithEvents Label6 As Label
    Friend WithEvents Panel4 As Panel
End Class
