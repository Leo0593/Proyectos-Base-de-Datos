<Global.Microsoft.VisualBasic.CompilerServices.DesignerGenerated()> _
Partial Class Inicio_Sesion
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
        Dim resources As System.ComponentModel.ComponentResourceManager = New System.ComponentModel.ComponentResourceManager(GetType(Inicio_Sesion))
        Me.BUS_USUARIO = New System.Windows.Forms.TextBox()
        Me.BUS_CONTRASEÑA = New System.Windows.Forms.TextBox()
        Me.Label1 = New System.Windows.Forms.Label()
        Me.Button2 = New System.Windows.Forms.Button()
        Me.TX_CONTRASEÑA = New System.Windows.Forms.Label()
        Me.Label2 = New System.Windows.Forms.Label()
        Me.Button1 = New System.Windows.Forms.Button()
        Me.Panel1 = New System.Windows.Forms.Panel()
        Me.Panel1.SuspendLayout()
        Me.SuspendLayout()
        '
        'BUS_USUARIO
        '
        Me.BUS_USUARIO.Location = New System.Drawing.Point(22, 50)
        Me.BUS_USUARIO.Name = "BUS_USUARIO"
        Me.BUS_USUARIO.Size = New System.Drawing.Size(246, 20)
        Me.BUS_USUARIO.TabIndex = 1
        '
        'BUS_CONTRASEÑA
        '
        Me.BUS_CONTRASEÑA.Location = New System.Drawing.Point(21, 114)
        Me.BUS_CONTRASEÑA.Name = "BUS_CONTRASEÑA"
        Me.BUS_CONTRASEÑA.Size = New System.Drawing.Size(246, 20)
        Me.BUS_CONTRASEÑA.TabIndex = 2
        '
        'Label1
        '
        Me.Label1.AutoSize = True
        Me.Label1.Font = New System.Drawing.Font("Sylfaen", 25.0!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.Label1.Location = New System.Drawing.Point(48, 60)
        Me.Label1.Name = "Label1"
        Me.Label1.Size = New System.Drawing.Size(272, 44)
        Me.Label1.TabIndex = 3
        Me.Label1.Text = "INICIAR SESIÓN"
        '
        'Button2
        '
        Me.Button2.BackColor = System.Drawing.SystemColors.HotTrack
        Me.Button2.Font = New System.Drawing.Font("Sylfaen", 10.0!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.Button2.ForeColor = System.Drawing.Color.White
        Me.Button2.Location = New System.Drawing.Point(153, 151)
        Me.Button2.Name = "Button2"
        Me.Button2.Size = New System.Drawing.Size(101, 35)
        Me.Button2.TabIndex = 7
        Me.Button2.Text = "Registrarte"
        Me.Button2.UseVisualStyleBackColor = False
        '
        'TX_CONTRASEÑA
        '
        Me.TX_CONTRASEÑA.AutoSize = True
        Me.TX_CONTRASEÑA.BackColor = System.Drawing.Color.Transparent
        Me.TX_CONTRASEÑA.Font = New System.Drawing.Font("Sylfaen", 15.0!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.TX_CONTRASEÑA.Location = New System.Drawing.Point(18, 84)
        Me.TX_CONTRASEÑA.Name = "TX_CONTRASEÑA"
        Me.TX_CONTRASEÑA.Size = New System.Drawing.Size(145, 26)
        Me.TX_CONTRASEÑA.TabIndex = 5
        Me.TX_CONTRASEÑA.Text = "CONTRASEÑA"
        '
        'Label2
        '
        Me.Label2.AutoSize = True
        Me.Label2.BackColor = System.Drawing.Color.Transparent
        Me.Label2.Font = New System.Drawing.Font("Sylfaen", 15.0!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.Label2.Location = New System.Drawing.Point(25, 19)
        Me.Label2.Name = "Label2"
        Me.Label2.Size = New System.Drawing.Size(100, 26)
        Me.Label2.TabIndex = 9
        Me.Label2.Text = "USUARIO"
        '
        'Button1
        '
        Me.Button1.BackColor = System.Drawing.SystemColors.Highlight
        Me.Button1.Font = New System.Drawing.Font("Sylfaen", 10.0!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.Button1.ForeColor = System.Drawing.Color.White
        Me.Button1.Location = New System.Drawing.Point(27, 151)
        Me.Button1.Name = "Button1"
        Me.Button1.Size = New System.Drawing.Size(98, 35)
        Me.Button1.TabIndex = 6
        Me.Button1.Text = "Iniciar Sesión"
        Me.Button1.UseVisualStyleBackColor = False
        '
        'Panel1
        '
        Me.Panel1.Controls.Add(Me.Label2)
        Me.Panel1.Controls.Add(Me.Button2)
        Me.Panel1.Controls.Add(Me.Button1)
        Me.Panel1.Controls.Add(Me.TX_CONTRASEÑA)
        Me.Panel1.Controls.Add(Me.BUS_CONTRASEÑA)
        Me.Panel1.Controls.Add(Me.BUS_USUARIO)
        Me.Panel1.Location = New System.Drawing.Point(43, 117)
        Me.Panel1.Name = "Panel1"
        Me.Panel1.Size = New System.Drawing.Size(285, 210)
        Me.Panel1.TabIndex = 10
        '
        'Inicio_Sesion
        '
        Me.AutoScaleDimensions = New System.Drawing.SizeF(6.0!, 13.0!)
        Me.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font
        Me.BackColor = System.Drawing.SystemColors.ActiveCaption
        Me.BackgroundImage = CType(resources.GetObject("$this.BackgroundImage"), System.Drawing.Image)
        Me.BackgroundImageLayout = System.Windows.Forms.ImageLayout.Zoom
        Me.ClientSize = New System.Drawing.Size(677, 381)
        Me.Controls.Add(Me.Panel1)
        Me.Controls.Add(Me.Label1)
        Me.Name = "Inicio_Sesion"
        Me.Text = "Form1"
        Me.Panel1.ResumeLayout(False)
        Me.Panel1.PerformLayout()
        Me.ResumeLayout(False)
        Me.PerformLayout()

    End Sub
    Friend WithEvents BUS_USUARIO As TextBox
    Friend WithEvents BUS_CONTRASEÑA As TextBox
    Friend WithEvents Label1 As Label
    Friend WithEvents Button2 As Button
    Friend WithEvents TX_CONTRASEÑA As Label
    Friend WithEvents Label2 As Label
    Friend WithEvents Button1 As Button
    Friend WithEvents Panel1 As Panel
End Class
