<Global.Microsoft.VisualBasic.CompilerServices.DesignerGenerated()> _
Partial Class Ahorro
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
        Dim resources As System.ComponentModel.ComponentResourceManager = New System.ComponentModel.ComponentResourceManager(GetType(Ahorro))
        Me.INS_AHORROS = New System.Windows.Forms.TextBox()
        Me.Button1 = New System.Windows.Forms.Button()
        Me.Retornar = New System.Windows.Forms.Button()
        Me.SuspendLayout()
        '
        'INS_AHORROS
        '
        Me.INS_AHORROS.BackColor = System.Drawing.SystemColors.ScrollBar
        Me.INS_AHORROS.Font = New System.Drawing.Font("Britannic Bold", 15.0!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.INS_AHORROS.Location = New System.Drawing.Point(431, 187)
        Me.INS_AHORROS.Name = "INS_AHORROS"
        Me.INS_AHORROS.Size = New System.Drawing.Size(171, 30)
        Me.INS_AHORROS.TabIndex = 2
        Me.INS_AHORROS.TextAlign = System.Windows.Forms.HorizontalAlignment.Center
        '
        'Button1
        '
        Me.Button1.BackColor = System.Drawing.SystemColors.Highlight
        Me.Button1.Font = New System.Drawing.Font("Britannic Bold", 15.0!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.Button1.ForeColor = System.Drawing.SystemColors.ButtonFace
        Me.Button1.Location = New System.Drawing.Point(461, 222)
        Me.Button1.Name = "Button1"
        Me.Button1.Size = New System.Drawing.Size(115, 31)
        Me.Button1.TabIndex = 3
        Me.Button1.Text = "INGRESAR"
        Me.Button1.UseVisualStyleBackColor = False
        '
        'Retornar
        '
        Me.Retornar.BackColor = System.Drawing.Color.Transparent
        Me.Retornar.BackgroundImage = CType(resources.GetObject("Retornar.BackgroundImage"), System.Drawing.Image)
        Me.Retornar.BackgroundImageLayout = System.Windows.Forms.ImageLayout.Zoom
        Me.Retornar.FlatAppearance.BorderSize = 0
        Me.Retornar.FlatStyle = System.Windows.Forms.FlatStyle.Flat
        Me.Retornar.Location = New System.Drawing.Point(3, 3)
        Me.Retornar.Name = "Retornar"
        Me.Retornar.Size = New System.Drawing.Size(43, 38)
        Me.Retornar.TabIndex = 4
        Me.Retornar.UseVisualStyleBackColor = False
        '
        'Ahorro
        '
        Me.AutoScaleDimensions = New System.Drawing.SizeF(6.0!, 13.0!)
        Me.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font
        Me.BackgroundImage = CType(resources.GetObject("$this.BackgroundImage"), System.Drawing.Image)
        Me.BackgroundImageLayout = System.Windows.Forms.ImageLayout.Zoom
        Me.ClientSize = New System.Drawing.Size(800, 450)
        Me.Controls.Add(Me.Retornar)
        Me.Controls.Add(Me.Button1)
        Me.Controls.Add(Me.INS_AHORROS)
        Me.DoubleBuffered = True
        Me.Name = "Ahorro"
        Me.Text = "Ahorro"
        Me.ResumeLayout(False)
        Me.PerformLayout()

    End Sub
    Friend WithEvents INS_AHORROS As TextBox
    Friend WithEvents Button1 As Button
    Friend WithEvents Retornar As Button
End Class
