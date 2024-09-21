<Global.Microsoft.VisualBasic.CompilerServices.DesignerGenerated()> _
Partial Class Registrarte
    Inherits System.Windows.Forms.Form

    'Form reemplaza a Dispose para limpiar la lista de componentes.
    <System.Diagnostics.DebuggerNonUserCode()> _
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
    <System.Diagnostics.DebuggerStepThrough()> _
    Private Sub InitializeComponent()
        Dim resources As System.ComponentModel.ComponentResourceManager = New System.ComponentModel.ComponentResourceManager(GetType(Registrarte))
        Me.TX_NOMBRE = New System.Windows.Forms.Label()
        Me.TX_APELLIDO = New System.Windows.Forms.Label()
        Me.TX_TELEFONO = New System.Windows.Forms.Label()
        Me.TX_EMAIL = New System.Windows.Forms.Label()
        Me.TX_USUARIO = New System.Windows.Forms.Label()
        Me.TX_CONTRASEÑA = New System.Windows.Forms.Label()
        Me.INS_NOMBRE = New System.Windows.Forms.TextBox()
        Me.INS_APELLIDO = New System.Windows.Forms.TextBox()
        Me.INS_TELEFONO = New System.Windows.Forms.TextBox()
        Me.INS_EMAIL = New System.Windows.Forms.TextBox()
        Me.INS_USUARIO = New System.Windows.Forms.TextBox()
        Me.INS_CONTRASEÑA = New System.Windows.Forms.TextBox()
        Me.REGISTRAR = New System.Windows.Forms.Button()
        Me.HelpProvider1 = New System.Windows.Forms.HelpProvider()
        Me.Panel1 = New System.Windows.Forms.Panel()
        Me.Label1 = New System.Windows.Forms.Label()
        Me.Retornar = New System.Windows.Forms.Button()
        Me.Panel1.SuspendLayout()
        Me.SuspendLayout()
        '
        'TX_NOMBRE
        '
        Me.TX_NOMBRE.AutoSize = True
        Me.TX_NOMBRE.Font = New System.Drawing.Font("Sylfaen", 10.0!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.TX_NOMBRE.Location = New System.Drawing.Point(88, 10)
        Me.TX_NOMBRE.Name = "TX_NOMBRE"
        Me.TX_NOMBRE.Size = New System.Drawing.Size(68, 18)
        Me.TX_NOMBRE.TabIndex = 0
        Me.TX_NOMBRE.Text = "NOMBRE"
        '
        'TX_APELLIDO
        '
        Me.TX_APELLIDO.AutoSize = True
        Me.TX_APELLIDO.Font = New System.Drawing.Font("Sylfaen", 10.0!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.TX_APELLIDO.Location = New System.Drawing.Point(86, 57)
        Me.TX_APELLIDO.Name = "TX_APELLIDO"
        Me.TX_APELLIDO.Size = New System.Drawing.Size(76, 18)
        Me.TX_APELLIDO.TabIndex = 1
        Me.TX_APELLIDO.Text = "APELLIDO"
        '
        'TX_TELEFONO
        '
        Me.TX_TELEFONO.AutoSize = True
        Me.TX_TELEFONO.Font = New System.Drawing.Font("Sylfaen", 10.0!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.TX_TELEFONO.Location = New System.Drawing.Point(83, 107)
        Me.TX_TELEFONO.Name = "TX_TELEFONO"
        Me.TX_TELEFONO.Size = New System.Drawing.Size(82, 18)
        Me.TX_TELEFONO.TabIndex = 2
        Me.TX_TELEFONO.Text = "TELEFONO"
        '
        'TX_EMAIL
        '
        Me.TX_EMAIL.AutoSize = True
        Me.TX_EMAIL.Font = New System.Drawing.Font("Sylfaen", 10.0!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.TX_EMAIL.Location = New System.Drawing.Point(40, 161)
        Me.TX_EMAIL.Name = "TX_EMAIL"
        Me.TX_EMAIL.Size = New System.Drawing.Size(167, 18)
        Me.TX_EMAIL.TabIndex = 3
        Me.TX_EMAIL.Text = "CORREO ELECTRONICO"
        '
        'TX_USUARIO
        '
        Me.TX_USUARIO.AutoSize = True
        Me.TX_USUARIO.Font = New System.Drawing.Font("Sylfaen", 10.0!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.TX_USUARIO.Location = New System.Drawing.Point(83, 210)
        Me.TX_USUARIO.Name = "TX_USUARIO"
        Me.TX_USUARIO.Size = New System.Drawing.Size(72, 18)
        Me.TX_USUARIO.TabIndex = 4
        Me.TX_USUARIO.Text = "USUARIO"
        '
        'TX_CONTRASEÑA
        '
        Me.TX_CONTRASEÑA.AutoSize = True
        Me.TX_CONTRASEÑA.Font = New System.Drawing.Font("Sylfaen", 10.0!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.TX_CONTRASEÑA.Location = New System.Drawing.Point(73, 259)
        Me.TX_CONTRASEÑA.Name = "TX_CONTRASEÑA"
        Me.TX_CONTRASEÑA.Size = New System.Drawing.Size(103, 18)
        Me.TX_CONTRASEÑA.TabIndex = 5
        Me.TX_CONTRASEÑA.Text = "CONTRASEÑA"
        '
        'INS_NOMBRE
        '
        Me.INS_NOMBRE.Location = New System.Drawing.Point(25, 31)
        Me.INS_NOMBRE.Name = "INS_NOMBRE"
        Me.INS_NOMBRE.Size = New System.Drawing.Size(198, 20)
        Me.INS_NOMBRE.TabIndex = 6
        '
        'INS_APELLIDO
        '
        Me.INS_APELLIDO.Location = New System.Drawing.Point(25, 78)
        Me.INS_APELLIDO.Name = "INS_APELLIDO"
        Me.INS_APELLIDO.Size = New System.Drawing.Size(198, 20)
        Me.INS_APELLIDO.TabIndex = 7
        '
        'INS_TELEFONO
        '
        Me.INS_TELEFONO.Location = New System.Drawing.Point(25, 128)
        Me.INS_TELEFONO.Name = "INS_TELEFONO"
        Me.INS_TELEFONO.Size = New System.Drawing.Size(198, 20)
        Me.INS_TELEFONO.TabIndex = 8
        '
        'INS_EMAIL
        '
        Me.INS_EMAIL.Location = New System.Drawing.Point(25, 182)
        Me.INS_EMAIL.Name = "INS_EMAIL"
        Me.INS_EMAIL.Size = New System.Drawing.Size(198, 20)
        Me.INS_EMAIL.TabIndex = 9
        '
        'INS_USUARIO
        '
        Me.INS_USUARIO.Location = New System.Drawing.Point(25, 231)
        Me.INS_USUARIO.Name = "INS_USUARIO"
        Me.INS_USUARIO.Size = New System.Drawing.Size(198, 20)
        Me.INS_USUARIO.TabIndex = 10
        '
        'INS_CONTRASEÑA
        '
        Me.INS_CONTRASEÑA.Location = New System.Drawing.Point(25, 280)
        Me.INS_CONTRASEÑA.Name = "INS_CONTRASEÑA"
        Me.INS_CONTRASEÑA.Size = New System.Drawing.Size(198, 20)
        Me.INS_CONTRASEÑA.TabIndex = 11
        '
        'REGISTRAR
        '
        Me.REGISTRAR.BackColor = System.Drawing.SystemColors.Highlight
        Me.REGISTRAR.Font = New System.Drawing.Font("Sylfaen", 13.0!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.REGISTRAR.ForeColor = System.Drawing.SystemColors.ButtonHighlight
        Me.REGISTRAR.Location = New System.Drawing.Point(44, 313)
        Me.REGISTRAR.Name = "REGISTRAR"
        Me.REGISTRAR.Size = New System.Drawing.Size(157, 31)
        Me.REGISTRAR.TabIndex = 12
        Me.REGISTRAR.Text = "Registrarte"
        Me.REGISTRAR.UseVisualStyleBackColor = False
        '
        'Panel1
        '
        Me.Panel1.BackColor = System.Drawing.SystemColors.ActiveCaption
        Me.Panel1.Controls.Add(Me.INS_NOMBRE)
        Me.Panel1.Controls.Add(Me.TX_APELLIDO)
        Me.Panel1.Controls.Add(Me.REGISTRAR)
        Me.Panel1.Controls.Add(Me.INS_CONTRASEÑA)
        Me.Panel1.Controls.Add(Me.TX_NOMBRE)
        Me.Panel1.Controls.Add(Me.TX_CONTRASEÑA)
        Me.Panel1.Controls.Add(Me.INS_USUARIO)
        Me.Panel1.Controls.Add(Me.INS_APELLIDO)
        Me.Panel1.Controls.Add(Me.INS_EMAIL)
        Me.Panel1.Controls.Add(Me.TX_USUARIO)
        Me.Panel1.Controls.Add(Me.TX_TELEFONO)
        Me.Panel1.Controls.Add(Me.INS_TELEFONO)
        Me.Panel1.Controls.Add(Me.TX_EMAIL)
        Me.Panel1.Location = New System.Drawing.Point(393, 58)
        Me.Panel1.Name = "Panel1"
        Me.Panel1.Size = New System.Drawing.Size(253, 349)
        Me.Panel1.TabIndex = 13
        '
        'Label1
        '
        Me.Label1.AutoSize = True
        Me.Label1.BackColor = System.Drawing.Color.Transparent
        Me.Label1.Font = New System.Drawing.Font("Sylfaen", 25.0!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.Label1.ForeColor = System.Drawing.SystemColors.ButtonHighlight
        Me.Label1.Location = New System.Drawing.Point(400, 11)
        Me.Label1.Name = "Label1"
        Me.Label1.Size = New System.Drawing.Size(243, 44)
        Me.Label1.TabIndex = 14
        Me.Label1.Text = "REGISTRARTE"
        '
        'Retornar
        '
        Me.Retornar.BackColor = System.Drawing.Color.Transparent
        Me.Retornar.BackgroundImage = CType(resources.GetObject("Retornar.BackgroundImage"), System.Drawing.Image)
        Me.Retornar.BackgroundImageLayout = System.Windows.Forms.ImageLayout.Zoom
        Me.Retornar.FlatAppearance.BorderSize = 0
        Me.Retornar.FlatStyle = System.Windows.Forms.FlatStyle.Flat
        Me.Retornar.Location = New System.Drawing.Point(679, 379)
        Me.Retornar.Name = "Retornar"
        Me.Retornar.Size = New System.Drawing.Size(45, 36)
        Me.Retornar.TabIndex = 15
        Me.Retornar.UseVisualStyleBackColor = False
        '
        'Registrarte
        '
        Me.AutoScaleDimensions = New System.Drawing.SizeF(6.0!, 13.0!)
        Me.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font
        Me.BackgroundImage = CType(resources.GetObject("$this.BackgroundImage"), System.Drawing.Image)
        Me.BackgroundImageLayout = System.Windows.Forms.ImageLayout.Zoom
        Me.ClientSize = New System.Drawing.Size(725, 419)
        Me.Controls.Add(Me.Retornar)
        Me.Controls.Add(Me.Label1)
        Me.Controls.Add(Me.Panel1)
        Me.DoubleBuffered = True
        Me.Name = "Registrarte"
        Me.Text = "Registrarte"
        Me.Panel1.ResumeLayout(False)
        Me.Panel1.PerformLayout()
        Me.ResumeLayout(False)
        Me.PerformLayout()

    End Sub

    Friend WithEvents TX_NOMBRE As Label
    Friend WithEvents TX_APELLIDO As Label
    Friend WithEvents TX_TELEFONO As Label
    Friend WithEvents TX_EMAIL As Label
    Friend WithEvents TX_USUARIO As Label
    Friend WithEvents TX_CONTRASEÑA As Label
    Friend WithEvents INS_NOMBRE As TextBox
    Friend WithEvents INS_APELLIDO As TextBox
    Friend WithEvents INS_TELEFONO As TextBox
    Friend WithEvents INS_EMAIL As TextBox
    Friend WithEvents INS_USUARIO As TextBox
    Friend WithEvents INS_CONTRASEÑA As TextBox
    Friend WithEvents REGISTRAR As Button
    Friend WithEvents HelpProvider1 As HelpProvider
    Friend WithEvents Panel1 As Panel
    Friend WithEvents Label1 As Label
    Friend WithEvents Retornar As Button
End Class
