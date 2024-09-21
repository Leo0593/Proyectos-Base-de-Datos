<Global.Microsoft.VisualBasic.CompilerServices.DesignerGenerated()>
Partial Class Menu_Principal
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
        Dim resources As System.ComponentModel.ComponentResourceManager = New System.ComponentModel.ComponentResourceManager(GetType(Menu_Principal))
        Me.BOTON_INGRESOS = New System.Windows.Forms.Button()
        Me.BOTON_GASTOS = New System.Windows.Forms.Button()
        Me.Pantalla = New System.Windows.Forms.DataGridView()
        Me.BOTON_AHORROS = New System.Windows.Forms.Button()
        Me.Panel1 = New System.Windows.Forms.Panel()
        Me.PictureBox1 = New System.Windows.Forms.PictureBox()
        Me.PictureBox2 = New System.Windows.Forms.PictureBox()
        Me.Label1 = New System.Windows.Forms.Label()
        Me.Sobrante = New System.Windows.Forms.TextBox()
        Me.Panel2 = New System.Windows.Forms.Panel()
        Me.Ahorro = New System.Windows.Forms.TextBox()
        Me.Label8 = New System.Windows.Forms.Label()
        Me.Label4 = New System.Windows.Forms.Label()
        Me.Label3 = New System.Windows.Forms.Label()
        Me.Label2 = New System.Windows.Forms.Label()
        Me.Totales = New System.Windows.Forms.Button()
        Me.Gastos_Totales = New System.Windows.Forms.TextBox()
        Me.Ingresos_Totales = New System.Windows.Forms.TextBox()
        Me.Panel3 = New System.Windows.Forms.Panel()
        Me.Label5 = New System.Windows.Forms.Label()
        Me.DateTimeExp = New System.Windows.Forms.DateTimePicker()
        Me.Button2 = New System.Windows.Forms.Button()
        Me.Button3 = New System.Windows.Forms.Button()
        Me.MOSTRAR_GASTOS = New System.Windows.Forms.Button()
        Me.Label6 = New System.Windows.Forms.Label()
        Me.Label7 = New System.Windows.Forms.Label()
        Me.Panel6 = New System.Windows.Forms.Panel()
        Me.Panel4 = New System.Windows.Forms.Panel()
        CType(Me.Pantalla, System.ComponentModel.ISupportInitialize).BeginInit()
        Me.Panel1.SuspendLayout()
        CType(Me.PictureBox1, System.ComponentModel.ISupportInitialize).BeginInit()
        CType(Me.PictureBox2, System.ComponentModel.ISupportInitialize).BeginInit()
        Me.Panel2.SuspendLayout()
        Me.Panel3.SuspendLayout()
        Me.Panel6.SuspendLayout()
        Me.Panel4.SuspendLayout()
        Me.SuspendLayout()
        '
        'BOTON_INGRESOS
        '
        Me.BOTON_INGRESOS.BackColor = System.Drawing.SystemColors.InactiveCaption
        Me.BOTON_INGRESOS.Font = New System.Drawing.Font("Britannic Bold", 25.0!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.BOTON_INGRESOS.Location = New System.Drawing.Point(17, 19)
        Me.BOTON_INGRESOS.Name = "BOTON_INGRESOS"
        Me.BOTON_INGRESOS.Size = New System.Drawing.Size(243, 74)
        Me.BOTON_INGRESOS.TabIndex = 1
        Me.BOTON_INGRESOS.Text = "INGRESOS"
        Me.BOTON_INGRESOS.UseVisualStyleBackColor = False
        '
        'BOTON_GASTOS
        '
        Me.BOTON_GASTOS.BackColor = System.Drawing.SystemColors.InactiveCaption
        Me.BOTON_GASTOS.Font = New System.Drawing.Font("Britannic Bold", 25.0!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.BOTON_GASTOS.Location = New System.Drawing.Point(17, 110)
        Me.BOTON_GASTOS.Name = "BOTON_GASTOS"
        Me.BOTON_GASTOS.Size = New System.Drawing.Size(243, 72)
        Me.BOTON_GASTOS.TabIndex = 2
        Me.BOTON_GASTOS.Text = "GASTOS"
        Me.BOTON_GASTOS.UseVisualStyleBackColor = False
        '
        'Pantalla
        '
        Me.Pantalla.ColumnHeadersHeightSizeMode = System.Windows.Forms.DataGridViewColumnHeadersHeightSizeMode.AutoSize
        Me.Pantalla.Location = New System.Drawing.Point(16, 205)
        Me.Pantalla.Name = "Pantalla"
        Me.Pantalla.Size = New System.Drawing.Size(569, 167)
        Me.Pantalla.TabIndex = 4
        '
        'BOTON_AHORROS
        '
        Me.BOTON_AHORROS.BackColor = System.Drawing.SystemColors.InactiveCaption
        Me.BOTON_AHORROS.Font = New System.Drawing.Font("Britannic Bold", 25.0!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.BOTON_AHORROS.Location = New System.Drawing.Point(17, 199)
        Me.BOTON_AHORROS.Name = "BOTON_AHORROS"
        Me.BOTON_AHORROS.Size = New System.Drawing.Size(243, 73)
        Me.BOTON_AHORROS.TabIndex = 5
        Me.BOTON_AHORROS.Text = "AHORROS"
        Me.BOTON_AHORROS.UseVisualStyleBackColor = False
        '
        'Panel1
        '
        Me.Panel1.BackColor = System.Drawing.SystemColors.ActiveCaptionText
        Me.Panel1.Controls.Add(Me.BOTON_AHORROS)
        Me.Panel1.Controls.Add(Me.BOTON_GASTOS)
        Me.Panel1.Controls.Add(Me.BOTON_INGRESOS)
        Me.Panel1.Location = New System.Drawing.Point(16, 382)
        Me.Panel1.Name = "Panel1"
        Me.Panel1.Size = New System.Drawing.Size(284, 307)
        Me.Panel1.TabIndex = 6
        '
        'PictureBox1
        '
        Me.PictureBox1.BackColor = System.Drawing.Color.MediumBlue
        Me.PictureBox1.BackgroundImageLayout = System.Windows.Forms.ImageLayout.Stretch
        Me.PictureBox1.Location = New System.Drawing.Point(-1, 0)
        Me.PictureBox1.Name = "PictureBox1"
        Me.PictureBox1.Size = New System.Drawing.Size(967, 187)
        Me.PictureBox1.TabIndex = 7
        Me.PictureBox1.TabStop = False
        '
        'PictureBox2
        '
        Me.PictureBox2.BackColor = System.Drawing.Color.MediumBlue
        Me.PictureBox2.BackgroundImage = CType(resources.GetObject("PictureBox2.BackgroundImage"), System.Drawing.Image)
        Me.PictureBox2.Location = New System.Drawing.Point(-1, 0)
        Me.PictureBox2.Name = "PictureBox2"
        Me.PictureBox2.Size = New System.Drawing.Size(200, 187)
        Me.PictureBox2.TabIndex = 8
        Me.PictureBox2.TabStop = False
        '
        'Label1
        '
        Me.Label1.AutoSize = True
        Me.Label1.BackColor = System.Drawing.Color.MediumBlue
        Me.Label1.Font = New System.Drawing.Font("Britannic Bold", 70.0!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.Label1.ForeColor = System.Drawing.SystemColors.ButtonHighlight
        Me.Label1.Location = New System.Drawing.Point(181, 2)
        Me.Label1.Name = "Label1"
        Me.Label1.Size = New System.Drawing.Size(546, 104)
        Me.Label1.TabIndex = 9
        Me.Label1.Text = "BIENVENIDO"
        '
        'Sobrante
        '
        Me.Sobrante.Font = New System.Drawing.Font("Britannic Bold", 15.0!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.Sobrante.Location = New System.Drawing.Point(33, 246)
        Me.Sobrante.Name = "Sobrante"
        Me.Sobrante.Size = New System.Drawing.Size(188, 30)
        Me.Sobrante.TabIndex = 10
        Me.Sobrante.TextAlign = System.Windows.Forms.HorizontalAlignment.Center
        '
        'Panel2
        '
        Me.Panel2.BackColor = System.Drawing.SystemColors.ActiveCaptionText
        Me.Panel2.Controls.Add(Me.Ahorro)
        Me.Panel2.Controls.Add(Me.Label8)
        Me.Panel2.Controls.Add(Me.Label4)
        Me.Panel2.Controls.Add(Me.Label3)
        Me.Panel2.Controls.Add(Me.Label2)
        Me.Panel2.Controls.Add(Me.Totales)
        Me.Panel2.Controls.Add(Me.Gastos_Totales)
        Me.Panel2.Controls.Add(Me.Ingresos_Totales)
        Me.Panel2.Controls.Add(Me.Sobrante)
        Me.Panel2.Location = New System.Drawing.Point(335, 382)
        Me.Panel2.Name = "Panel2"
        Me.Panel2.Size = New System.Drawing.Size(250, 349)
        Me.Panel2.TabIndex = 11
        '
        'Ahorro
        '
        Me.Ahorro.Font = New System.Drawing.Font("Britannic Bold", 15.0!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.Ahorro.Location = New System.Drawing.Point(31, 176)
        Me.Ahorro.Name = "Ahorro"
        Me.Ahorro.Size = New System.Drawing.Size(188, 30)
        Me.Ahorro.TabIndex = 18
        Me.Ahorro.TextAlign = System.Windows.Forms.HorizontalAlignment.Center
        '
        'Label8
        '
        Me.Label8.AutoSize = True
        Me.Label8.Font = New System.Drawing.Font("Britannic Bold", 15.0!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.Label8.ForeColor = System.Drawing.SystemColors.ButtonHighlight
        Me.Label8.Location = New System.Drawing.Point(83, 150)
        Me.Label8.Name = "Label8"
        Me.Label8.Size = New System.Drawing.Size(86, 22)
        Me.Label8.TabIndex = 17
        Me.Label8.Text = "AHORRO"
        Me.Label8.TextAlign = System.Drawing.ContentAlignment.MiddleCenter
        '
        'Label4
        '
        Me.Label4.AutoSize = True
        Me.Label4.Font = New System.Drawing.Font("Britannic Bold", 15.0!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.Label4.ForeColor = System.Drawing.SystemColors.ButtonHighlight
        Me.Label4.Location = New System.Drawing.Point(74, 219)
        Me.Label4.Name = "Label4"
        Me.Label4.Size = New System.Drawing.Size(99, 22)
        Me.Label4.TabIndex = 16
        Me.Label4.Text = "RESTANTE"
        Me.Label4.TextAlign = System.Drawing.ContentAlignment.MiddleCenter
        '
        'Label3
        '
        Me.Label3.AutoSize = True
        Me.Label3.Font = New System.Drawing.Font("Britannic Bold", 15.0!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.Label3.ForeColor = System.Drawing.SystemColors.ButtonHighlight
        Me.Label3.Location = New System.Drawing.Point(35, 12)
        Me.Label3.Name = "Label3"
        Me.Label3.Size = New System.Drawing.Size(182, 22)
        Me.Label3.TabIndex = 15
        Me.Label3.Text = "INGRESOS TOTALES"
        '
        'Label2
        '
        Me.Label2.AutoSize = True
        Me.Label2.Font = New System.Drawing.Font("Britannic Bold", 15.0!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.Label2.ForeColor = System.Drawing.SystemColors.ButtonHighlight
        Me.Label2.Location = New System.Drawing.Point(46, 82)
        Me.Label2.Name = "Label2"
        Me.Label2.Size = New System.Drawing.Size(161, 22)
        Me.Label2.TabIndex = 14
        Me.Label2.Text = "GASTOS TOTALES"
        Me.Label2.TextAlign = System.Drawing.ContentAlignment.MiddleCenter
        '
        'Totales
        '
        Me.Totales.BackColor = System.Drawing.SystemColors.InactiveCaption
        Me.Totales.Font = New System.Drawing.Font("Britannic Bold", 13.0!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.Totales.Location = New System.Drawing.Point(33, 292)
        Me.Totales.Name = "Totales"
        Me.Totales.Size = New System.Drawing.Size(188, 42)
        Me.Totales.TabIndex = 13
        Me.Totales.Text = "Revisar Cantidades"
        Me.Totales.UseVisualStyleBackColor = False
        '
        'Gastos_Totales
        '
        Me.Gastos_Totales.Font = New System.Drawing.Font("Britannic Bold", 15.0!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.Gastos_Totales.Location = New System.Drawing.Point(33, 109)
        Me.Gastos_Totales.Name = "Gastos_Totales"
        Me.Gastos_Totales.Size = New System.Drawing.Size(188, 30)
        Me.Gastos_Totales.TabIndex = 11
        Me.Gastos_Totales.TextAlign = System.Windows.Forms.HorizontalAlignment.Center
        '
        'Ingresos_Totales
        '
        Me.Ingresos_Totales.Font = New System.Drawing.Font("Britannic Bold", 15.0!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.Ingresos_Totales.Location = New System.Drawing.Point(32, 39)
        Me.Ingresos_Totales.Name = "Ingresos_Totales"
        Me.Ingresos_Totales.Size = New System.Drawing.Size(188, 30)
        Me.Ingresos_Totales.TabIndex = 12
        Me.Ingresos_Totales.TextAlign = System.Windows.Forms.HorizontalAlignment.Center
        '
        'Panel3
        '
        Me.Panel3.BackColor = System.Drawing.SystemColors.ActiveBorder
        Me.Panel3.Controls.Add(Me.Label5)
        Me.Panel3.Controls.Add(Me.DateTimeExp)
        Me.Panel3.Controls.Add(Me.Button2)
        Me.Panel3.Location = New System.Drawing.Point(601, 205)
        Me.Panel3.Name = "Panel3"
        Me.Panel3.Size = New System.Drawing.Size(148, 167)
        Me.Panel3.TabIndex = 13
        '
        'Label5
        '
        Me.Label5.AutoSize = True
        Me.Label5.Font = New System.Drawing.Font("Britannic Bold", 15.0!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.Label5.Location = New System.Drawing.Point(15, 1)
        Me.Label5.Name = "Label5"
        Me.Label5.Size = New System.Drawing.Size(111, 44)
        Me.Label5.TabIndex = 4
        Me.Label5.Text = "Buscar por" & Global.Microsoft.VisualBasic.ChrW(13) & Global.Microsoft.VisualBasic.ChrW(10) & "Fecha"
        Me.Label5.TextAlign = System.Drawing.ContentAlignment.MiddleCenter
        '
        'DateTimeExp
        '
        Me.DateTimeExp.Location = New System.Drawing.Point(1, 48)
        Me.DateTimeExp.Name = "DateTimeExp"
        Me.DateTimeExp.Size = New System.Drawing.Size(145, 20)
        Me.DateTimeExp.TabIndex = 3
        '
        'Button2
        '
        Me.Button2.BackgroundImage = CType(resources.GetObject("Button2.BackgroundImage"), System.Drawing.Image)
        Me.Button2.BackgroundImageLayout = System.Windows.Forms.ImageLayout.Zoom
        Me.Button2.FlatAppearance.BorderSize = 0
        Me.Button2.FlatStyle = System.Windows.Forms.FlatStyle.Flat
        Me.Button2.Location = New System.Drawing.Point(10, 71)
        Me.Button2.Name = "Button2"
        Me.Button2.Size = New System.Drawing.Size(128, 90)
        Me.Button2.TabIndex = 1
        Me.Button2.UseVisualStyleBackColor = True
        '
        'Button3
        '
        Me.Button3.BackColor = System.Drawing.Color.Transparent
        Me.Button3.BackgroundImage = CType(resources.GetObject("Button3.BackgroundImage"), System.Drawing.Image)
        Me.Button3.BackgroundImageLayout = System.Windows.Forms.ImageLayout.Zoom
        Me.Button3.FlatAppearance.BorderSize = 0
        Me.Button3.FlatStyle = System.Windows.Forms.FlatStyle.Flat
        Me.Button3.Location = New System.Drawing.Point(9, 55)
        Me.Button3.Name = "Button3"
        Me.Button3.Size = New System.Drawing.Size(128, 109)
        Me.Button3.TabIndex = 2
        Me.Button3.UseVisualStyleBackColor = False
        '
        'MOSTRAR_GASTOS
        '
        Me.MOSTRAR_GASTOS.BackgroundImage = CType(resources.GetObject("MOSTRAR_GASTOS.BackgroundImage"), System.Drawing.Image)
        Me.MOSTRAR_GASTOS.BackgroundImageLayout = System.Windows.Forms.ImageLayout.Zoom
        Me.MOSTRAR_GASTOS.FlatAppearance.BorderSize = 0
        Me.MOSTRAR_GASTOS.FlatStyle = System.Windows.Forms.FlatStyle.Flat
        Me.MOSTRAR_GASTOS.Location = New System.Drawing.Point(6, 53)
        Me.MOSTRAR_GASTOS.Name = "MOSTRAR_GASTOS"
        Me.MOSTRAR_GASTOS.Size = New System.Drawing.Size(136, 109)
        Me.MOSTRAR_GASTOS.TabIndex = 0
        Me.MOSTRAR_GASTOS.UseVisualStyleBackColor = True
        '
        'Label6
        '
        Me.Label6.AutoSize = True
        Me.Label6.Font = New System.Drawing.Font("Britannic Bold", 14.0!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.Label6.Location = New System.Drawing.Point(11, 9)
        Me.Label6.Name = "Label6"
        Me.Label6.Size = New System.Drawing.Size(126, 42)
        Me.Label6.TabIndex = 4
        Me.Label6.Text = "Mostrar todos" & Global.Microsoft.VisualBasic.ChrW(13) & Global.Microsoft.VisualBasic.ChrW(10) & "los Gastos"
        Me.Label6.TextAlign = System.Drawing.ContentAlignment.MiddleCenter
        '
        'Label7
        '
        Me.Label7.AutoSize = True
        Me.Label7.Font = New System.Drawing.Font("Britannic Bold", 14.0!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.Label7.Location = New System.Drawing.Point(11, 10)
        Me.Label7.Name = "Label7"
        Me.Label7.Size = New System.Drawing.Size(126, 42)
        Me.Label7.TabIndex = 4
        Me.Label7.Text = "Mostrar todos" & Global.Microsoft.VisualBasic.ChrW(13) & Global.Microsoft.VisualBasic.ChrW(10) & "los Ingresos"
        Me.Label7.TextAlign = System.Drawing.ContentAlignment.MiddleCenter
        '
        'Panel6
        '
        Me.Panel6.BackColor = System.Drawing.SystemColors.ActiveBorder
        Me.Panel6.Controls.Add(Me.MOSTRAR_GASTOS)
        Me.Panel6.Controls.Add(Me.Label6)
        Me.Panel6.Location = New System.Drawing.Point(602, 382)
        Me.Panel6.Name = "Panel6"
        Me.Panel6.Size = New System.Drawing.Size(148, 167)
        Me.Panel6.TabIndex = 14
        '
        'Panel4
        '
        Me.Panel4.BackColor = System.Drawing.SystemColors.ActiveBorder
        Me.Panel4.Controls.Add(Me.Button3)
        Me.Panel4.Controls.Add(Me.Label7)
        Me.Panel4.Location = New System.Drawing.Point(601, 558)
        Me.Panel4.Name = "Panel4"
        Me.Panel4.Size = New System.Drawing.Size(148, 167)
        Me.Panel4.TabIndex = 15
        '
        'Menu_Principal
        '
        Me.AutoScaleDimensions = New System.Drawing.SizeF(6.0!, 13.0!)
        Me.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font
        Me.BackgroundImage = CType(resources.GetObject("$this.BackgroundImage"), System.Drawing.Image)
        Me.BackgroundImageLayout = System.Windows.Forms.ImageLayout.Stretch
        Me.ClientSize = New System.Drawing.Size(766, 749)
        Me.Controls.Add(Me.Panel4)
        Me.Controls.Add(Me.Panel6)
        Me.Controls.Add(Me.Panel3)
        Me.Controls.Add(Me.Panel2)
        Me.Controls.Add(Me.Label1)
        Me.Controls.Add(Me.PictureBox2)
        Me.Controls.Add(Me.PictureBox1)
        Me.Controls.Add(Me.Panel1)
        Me.Controls.Add(Me.Pantalla)
        Me.DoubleBuffered = True
        Me.Name = "Menu_Principal"
        Me.Text = "Menu_Principal"
        CType(Me.Pantalla, System.ComponentModel.ISupportInitialize).EndInit()
        Me.Panel1.ResumeLayout(False)
        CType(Me.PictureBox1, System.ComponentModel.ISupportInitialize).EndInit()
        CType(Me.PictureBox2, System.ComponentModel.ISupportInitialize).EndInit()
        Me.Panel2.ResumeLayout(False)
        Me.Panel2.PerformLayout()
        Me.Panel3.ResumeLayout(False)
        Me.Panel3.PerformLayout()
        Me.Panel6.ResumeLayout(False)
        Me.Panel6.PerformLayout()
        Me.Panel4.ResumeLayout(False)
        Me.Panel4.PerformLayout()
        Me.ResumeLayout(False)
        Me.PerformLayout()

    End Sub
    Friend WithEvents BOTON_INGRESOS As Button
    Friend WithEvents BOTON_GASTOS As Button
    Friend WithEvents Pantalla As DataGridView
    Friend WithEvents BOTON_AHORROS As Button
    Friend WithEvents Panel1 As Panel
    Friend WithEvents PictureBox1 As PictureBox
    Friend WithEvents PictureBox2 As PictureBox
    Friend WithEvents Label1 As Label
    Friend WithEvents Sobrante As TextBox
    Friend WithEvents Panel2 As Panel
    Friend WithEvents Ingresos_Totales As TextBox
    Friend WithEvents Gastos_Totales As TextBox
    Friend WithEvents Totales As Button
    Friend WithEvents Label2 As Label
    Friend WithEvents Label4 As Label
    Friend WithEvents Label3 As Label
    Friend WithEvents Panel3 As Panel
    Friend WithEvents Button3 As Button
    Friend WithEvents Button2 As Button
    Friend WithEvents MOSTRAR_GASTOS As Button
    Friend WithEvents DateTimeExp As DateTimePicker
    Friend WithEvents Label5 As Label
    Friend WithEvents Label6 As Label
    Friend WithEvents Label7 As Label
    Friend WithEvents Panel6 As Panel
    Friend WithEvents Panel4 As Panel
    Friend WithEvents Label8 As Label
    Friend WithEvents Ahorro As TextBox
End Class
