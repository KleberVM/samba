
import java.awt.Color;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author kleber
 */
public class ui extends javax.swing.JFrame {
    private mainn m ;
    private String ubicacionArchivoSmb;
    private String ubicacionUserTxt;
    private String ubicacionStatusTxt;
    private String codigoPermiso;
    public ui() throws IOException {
        initComponents();
        setTitle("Aplicacion de sistemas operativos");
        setSize(1000, 600);
        setDefaultCloseOperation(ui.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        inicio.setBackground(new Color(102,0,0));
        inicioo.setForeground(Color.WHITE);
        m = new mainn();
        ubicacionArchivoSmb = "/etc/samba/smb.conf";
        ubicacionUserTxt="/tmp/listUser.txt";
        ubicacionStatusTxt="/tmp/estsmb.txt";
        codigoPermiso="0";
        actualizarInicio();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        principal = new javax.swing.JPanel();
        superior = new javax.swing.JPanel();
        TituloSuperior = new javax.swing.JLabel();
        inferior = new javax.swing.JPanel();
        opcion = new javax.swing.JPanel();
        inicio = new javax.swing.JPanel();
        inicioo = new javax.swing.JLabel();
        compartir = new javax.swing.JPanel();
        compartiro = new javax.swing.JLabel();
        identidad = new javax.swing.JPanel();
        identidado = new javax.swing.JLabel();
        usuario = new javax.swing.JPanel();
        usuarioo = new javax.swing.JLabel();
        espacio2 = new javax.swing.JPanel();
        espacio1 = new javax.swing.JPanel();
        espacio3 = new javax.swing.JPanel();
        contenido = new javax.swing.JPanel();
        inicioc = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        estado = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        comboservicio = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        comboReinicio = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        compartirc = new javax.swing.JPanel();
        jPanel17 = new javax.swing.JPanel();
        jPanel43 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        recursos = new javax.swing.JTable();
        jPanel18 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jPanel19 = new javax.swing.JPanel();
        jPanel20 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jPanel21 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jPanel22 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jPanel23 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jPanel24 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jPanel25 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        identidadc = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        dominio = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        wins = new javax.swing.JTextField();
        jPanel7 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        usuarioc = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaU = new javax.swing.JTable();
        jPanel12 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        jPanel14 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jPanel15 = new javax.swing.JPanel();
        jPanel16 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        añadirc = new javax.swing.JPanel();
        jPanel26 = new javax.swing.JPanel();
        jPanel32 = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jPanel33 = new javax.swing.JPanel();
        jLabel27 = new javax.swing.JLabel();
        jCheckBox3 = new javax.swing.JCheckBox();
        jCheckBox4 = new javax.swing.JCheckBox();
        jLabel28 = new javax.swing.JLabel();
        route = new javax.swing.JTextField();
        jCheckBox5 = new javax.swing.JCheckBox();
        jPanel34 = new javax.swing.JPanel();
        jLabel29 = new javax.swing.JLabel();
        jCheckBox6 = new javax.swing.JCheckBox();
        jCheckBox7 = new javax.swing.JCheckBox();
        jPanel27 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jPanel28 = new javax.swing.JPanel();
        jPanel29 = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        jPanel30 = new javax.swing.JPanel();
        jPanel31 = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        editarc = new javax.swing.JPanel();
        jPanel35 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jPanel44 = new javax.swing.JPanel();
        jPanel45 = new javax.swing.JPanel();
        jPanel46 = new javax.swing.JPanel();
        jPanel36 = new javax.swing.JPanel();
        jLabel34 = new javax.swing.JLabel();
        rec = new javax.swing.JLabel();
        jPanel37 = new javax.swing.JPanel();
        jPanel38 = new javax.swing.JPanel();
        jLabel30 = new javax.swing.JLabel();
        jPanel39 = new javax.swing.JPanel();
        jPanel40 = new javax.swing.JPanel();
        jLabel31 = new javax.swing.JLabel();
        jPanel41 = new javax.swing.JPanel();
        jLabel32 = new javax.swing.JLabel();
        jPanel42 = new javax.swing.JPanel();
        jLabel33 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        principal.setBackground(new java.awt.Color(255, 255, 255));
        principal.setLayout(new java.awt.BorderLayout());

        superior.setBackground(new java.awt.Color(102, 0, 0));
        superior.setLayout(new java.awt.GridBagLayout());

        TituloSuperior.setFont(new java.awt.Font("Cantarell", 3, 48)); // NOI18N
        TituloSuperior.setForeground(new java.awt.Color(255, 255, 255));
        TituloSuperior.setText("Servidor Samba");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipady = 48;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 261, 0, 228);
        superior.add(TituloSuperior, gridBagConstraints);

        principal.add(superior, java.awt.BorderLayout.PAGE_START);

        inferior.setBackground(new java.awt.Color(255, 255, 255));
        inferior.setLayout(new java.awt.BorderLayout());

        opcion.setBackground(new java.awt.Color(204, 204, 204));
        opcion.setPreferredSize(new java.awt.Dimension(160, 271));
        opcion.setLayout(new java.awt.GridBagLayout());

        inicio.setBackground(new java.awt.Color(102, 0, 0));
        inicio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                inicioMouseClicked(evt);
            }
        });

        inicioo.setFont(new java.awt.Font("Cantarell", 0, 24)); // NOI18N
        inicioo.setForeground(new java.awt.Color(255, 255, 255));
        inicioo.setText("Inicio");
        inicio.add(inicioo);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 93;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(17, 0, 0, 0);
        opcion.add(inicio, gridBagConstraints);

        compartir.setBackground(new java.awt.Color(204, 204, 204));
        compartir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                compartirMouseClicked(evt);
            }
        });

        compartiro.setFont(new java.awt.Font("Cantarell", 0, 24)); // NOI18N
        compartiro.setText("Compartir");
        compartir.add(compartiro);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.ipadx = 41;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(12, 0, 0, 0);
        opcion.add(compartir, gridBagConstraints);

        identidad.setBackground(new java.awt.Color(204, 204, 204));
        identidad.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                identidadMouseClicked(evt);
            }
        });

        identidado.setFont(new java.awt.Font("Cantarell", 0, 24)); // NOI18N
        identidado.setText("Identidad");
        identidad.add(identidado);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.ipadx = 48;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(12, 0, 0, 0);
        opcion.add(identidad, gridBagConstraints);

        usuario.setBackground(new java.awt.Color(204, 204, 204));
        usuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                usuarioMouseClicked(evt);
            }
        });

        usuarioo.setFont(new java.awt.Font("Cantarell", 0, 24)); // NOI18N
        usuarioo.setText("Usuario");
        usuario.add(usuarioo);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.ipadx = 69;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(12, 0, 36, 0);
        opcion.add(usuario, gridBagConstraints);

        espacio2.setBackground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout espacio2Layout = new javax.swing.GroupLayout(espacio2);
        espacio2.setLayout(espacio2Layout);
        espacio2Layout.setHorizontalGroup(
            espacio2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 160, Short.MAX_VALUE)
        );
        espacio2Layout.setVerticalGroup(
            espacio2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 25, Short.MAX_VALUE)
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.ipadx = 160;
        gridBagConstraints.ipady = 25;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(12, 0, 0, 0);
        opcion.add(espacio2, gridBagConstraints);

        espacio1.setBackground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout espacio1Layout = new javax.swing.GroupLayout(espacio1);
        espacio1.setLayout(espacio1Layout);
        espacio1Layout.setHorizontalGroup(
            espacio1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 160, Short.MAX_VALUE)
        );
        espacio1Layout.setVerticalGroup(
            espacio1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 25, Short.MAX_VALUE)
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipadx = 160;
        gridBagConstraints.ipady = 25;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(12, 0, 0, 0);
        opcion.add(espacio1, gridBagConstraints);

        espacio3.setBackground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout espacio3Layout = new javax.swing.GroupLayout(espacio3);
        espacio3.setLayout(espacio3Layout);
        espacio3Layout.setHorizontalGroup(
            espacio3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 160, Short.MAX_VALUE)
        );
        espacio3Layout.setVerticalGroup(
            espacio3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 25, Short.MAX_VALUE)
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.ipadx = 160;
        gridBagConstraints.ipady = 25;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(12, 0, 0, 0);
        opcion.add(espacio3, gridBagConstraints);

        inferior.add(opcion, java.awt.BorderLayout.LINE_START);

        contenido.setBackground(new java.awt.Color(255, 255, 255));
        contenido.setLayout(new java.awt.CardLayout());

        inicioc.setBackground(new java.awt.Color(255, 255, 255));
        inicioc.setLayout(new java.awt.BorderLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new java.awt.GridLayout(1, 0));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setLayout(new java.awt.GridBagLayout());

        jLabel3.setFont(new java.awt.Font("Cantarell", 3, 22)); // NOI18N
        jLabel3.setText("Estado Actual :");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(103, 232, 0, 0);
        jPanel5.add(jLabel3, gridBagConstraints);

        estado.setFont(new java.awt.Font("Cantarell", 0, 22)); // NOI18N
        estado.setText("Estado");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 232, 0, 0);
        jPanel5.add(estado, gridBagConstraints);

        jLabel5.setFont(new java.awt.Font("Cantarell", 3, 22)); // NOI18N
        jLabel5.setText("Despues de escribir la configuracion :");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 232, 0, 0);
        jPanel5.add(jLabel5, gridBagConstraints);

        comboservicio.setFont(new java.awt.Font("Cantarell", 0, 18)); // NOI18N
        comboservicio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        comboservicio.setPreferredSize(new java.awt.Dimension(249, 28));
        comboservicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboservicioActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.ipadx = 176;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 232, 0, 0);
        jPanel5.add(comboservicio, gridBagConstraints);

        jLabel6.setFont(new java.awt.Font("Cantarell", 3, 22)); // NOI18N
        jLabel6.setText("Despues de reiniciar :");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 232, 0, 0);
        jPanel5.add(jLabel6, gridBagConstraints);

        comboReinicio.setFont(new java.awt.Font("Cantarell", 0, 18)); // NOI18N
        comboReinicio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "No iniciar", "Iniciar durante el arranque" }));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridwidth = 6;
        gridBagConstraints.ipadx = 163;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 232, 184, 486);
        jPanel5.add(comboReinicio, gridBagConstraints);

        jPanel1.add(jPanel5);

        inicioc.add(jPanel1, java.awt.BorderLayout.CENTER);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setPreferredSize(new java.awt.Dimension(0, 50));

        jLabel1.setFont(new java.awt.Font("Cantarell", 3, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 0, 0));
        jLabel1.setText("Configuracion del servidor");
        jPanel2.add(jLabel1);

        inicioc.add(jPanel2, java.awt.BorderLayout.PAGE_START);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setPreferredSize(new java.awt.Dimension(594, 40));
        jPanel3.setLayout(new java.awt.GridBagLayout());

        jPanel4.setBackground(new java.awt.Color(102, 0, 0));
        jPanel4.setLayout(new java.awt.GridBagLayout());

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Cantarell", 1, 30)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Aceptar");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        jPanel4.add(jLabel2, new java.awt.GridBagConstraints());

        jPanel3.add(jPanel4, new java.awt.GridBagConstraints());

        inicioc.add(jPanel3, java.awt.BorderLayout.PAGE_END);

        contenido.add(inicioc, "card7");

        compartirc.setLayout(new java.awt.BorderLayout());

        jPanel17.setBackground(new java.awt.Color(255, 255, 255));

        jPanel43.setBackground(new java.awt.Color(255, 255, 255));

        recursos.setFont(new java.awt.Font("Cantarell", 0, 18)); // NOI18N
        recursos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Estado", "Solo lectura", "Nombre", "Ruta", "Acceso Invitado", "Comentario"
            }
        ));
        recursos.setRowHeight(30);
        recursos.setSelectionBackground(new java.awt.Color(102, 0, 0));
        recursos.setSelectionForeground(new java.awt.Color(255, 255, 255));
        jScrollPane4.setViewportView(recursos);

        javax.swing.GroupLayout jPanel43Layout = new javax.swing.GroupLayout(jPanel43);
        jPanel43.setLayout(jPanel43Layout);
        jPanel43Layout.setHorizontalGroup(
            jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel43Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 1118, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel43Layout.setVerticalGroup(
            jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel43Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(168, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel43, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jPanel43, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        compartirc.add(jPanel17, java.awt.BorderLayout.CENTER);

        jPanel18.setBackground(new java.awt.Color(255, 255, 255));

        jLabel21.setFont(new java.awt.Font("Cantarell", 3, 36)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(102, 0, 0));
        jLabel21.setText("Recursos compartidos disponibles");
        jPanel18.add(jLabel21);

        compartirc.add(jPanel18, java.awt.BorderLayout.PAGE_START);

        jPanel19.setBackground(new java.awt.Color(255, 255, 255));

        jPanel20.setBackground(new java.awt.Color(102, 0, 0));
        jPanel20.setMaximumSize(new java.awt.Dimension(115, 37));
        jPanel20.setMinimumSize(new java.awt.Dimension(115, 37));
        jPanel20.setPreferredSize(new java.awt.Dimension(90, 30));
        jPanel20.setLayout(new java.awt.GridBagLayout());

        jLabel15.setFont(new java.awt.Font("Cantarell", 1, 24)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Añadir");
        jLabel15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel15MouseClicked(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(38, 28, 43, 19);
        jPanel20.add(jLabel15, gridBagConstraints);

        jPanel19.add(jPanel20);

        jPanel21.setBackground(new java.awt.Color(102, 0, 0));
        jPanel21.setLayout(new java.awt.GridBagLayout());

        jLabel16.setFont(new java.awt.Font("Cantarell", 1, 24)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Eliminar");
        jLabel16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel16MouseClicked(evt);
            }
        });
        jPanel21.add(jLabel16, new java.awt.GridBagConstraints());

        jPanel19.add(jPanel21);

        jPanel22.setBackground(new java.awt.Color(102, 0, 0));
        jPanel22.setLayout(new java.awt.GridBagLayout());

        jLabel17.setFont(new java.awt.Font("Cantarell", 1, 24)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Renombrar");
        jLabel17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel17MouseClicked(evt);
            }
        });
        jPanel22.add(jLabel17, new java.awt.GridBagConstraints());

        jPanel19.add(jPanel22);

        jPanel23.setBackground(new java.awt.Color(102, 0, 0));
        jPanel23.setLayout(new java.awt.GridBagLayout());

        jLabel18.setFont(new java.awt.Font("Cantarell", 1, 24)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Acceso Invitado");
        jLabel18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel18MouseClicked(evt);
            }
        });
        jPanel23.add(jLabel18, new java.awt.GridBagConstraints());

        jPanel19.add(jPanel23);

        jPanel24.setBackground(new java.awt.Color(102, 0, 0));
        jPanel24.setLayout(new java.awt.GridBagLayout());

        jLabel19.setFont(new java.awt.Font("Cantarell", 1, 24)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Cambiar Estado");
        jLabel19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel19MouseClicked(evt);
            }
        });
        jPanel24.add(jLabel19, new java.awt.GridBagConstraints());

        jPanel19.add(jPanel24);

        jPanel25.setBackground(new java.awt.Color(102, 0, 0));
        jPanel25.setLayout(new java.awt.GridBagLayout());

        jLabel20.setFont(new java.awt.Font("Cantarell", 1, 24)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("Editar");
        jLabel20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel20MouseClicked(evt);
            }
        });
        jPanel25.add(jLabel20, new java.awt.GridBagConstraints());

        jPanel19.add(jPanel25);

        compartirc.add(jPanel19, java.awt.BorderLayout.PAGE_END);

        contenido.add(compartirc, "card6");

        identidadc.setLayout(new java.awt.BorderLayout());

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setLayout(new java.awt.GridBagLayout());

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));
        jPanel10.setLayout(new java.awt.GridBagLayout());

        jLabel9.setFont(new java.awt.Font("Cantarell", 3, 24)); // NOI18N
        jLabel9.setText("Nombre del grupo de trabajo o dominio");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(24, 18, 0, 26);
        jPanel10.add(jLabel9, gridBagConstraints);

        dominio.setFont(new java.awt.Font("Cantarell", 0, 24)); // NOI18N
        dominio.setText("WORKGROUP");
        dominio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dominioActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.ipadx = 396;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 18, 0, 26);
        jPanel10.add(dominio, gridBagConstraints);

        jLabel10.setFont(new java.awt.Font("Cantarell", 3, 24)); // NOI18N
        jLabel10.setText("WINS");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 18, 0, 0);
        jPanel10.add(jLabel10, gridBagConstraints);

        jCheckBox1.setFont(new java.awt.Font("Cantarell", 0, 24)); // NOI18N
        jCheckBox1.setText("Compatibilidad con servidor WINS");
        jCheckBox1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jCheckBox1MouseClicked(evt);
            }
        });
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 18, 0, 0);
        jPanel10.add(jCheckBox1, gridBagConstraints);

        jCheckBox2.setFont(new java.awt.Font("Cantarell", 0, 24)); // NOI18N
        jCheckBox2.setText("Servidor WINS remoto");
        jCheckBox2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jCheckBox2MouseClicked(evt);
            }
        });
        jCheckBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox2ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 18, 0, 0);
        jPanel10.add(jCheckBox2, gridBagConstraints);

        wins.setFont(new java.awt.Font("Cantarell", 0, 24)); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.ipadx = 396;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 18, 36, 26);
        jPanel10.add(wins, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 20;
        gridBagConstraints.ipady = 30;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 169, 0, 292);
        jPanel6.add(jPanel10, gridBagConstraints);

        identidadc.add(jPanel6, java.awt.BorderLayout.CENTER);

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));

        jLabel8.setFont(new java.awt.Font("Cantarell", 3, 36)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(102, 0, 0));
        jLabel8.setText("Configuracion Basica");
        jPanel7.add(jLabel8);

        identidadc.add(jPanel7, java.awt.BorderLayout.PAGE_START);

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.setPreferredSize(new java.awt.Dimension(0, 40));
        jPanel8.setLayout(new java.awt.GridBagLayout());

        jPanel9.setBackground(new java.awt.Color(102, 0, 0));
        jPanel9.setLayout(new java.awt.GridBagLayout());

        jLabel7.setFont(new java.awt.Font("Cantarell", 1, 30)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Aceptar");
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });
        jPanel9.add(jLabel7, new java.awt.GridBagConstraints());

        jPanel8.add(jPanel9, new java.awt.GridBagConstraints());

        identidadc.add(jPanel8, java.awt.BorderLayout.PAGE_END);

        contenido.add(identidadc, "card5");

        usuarioc.setLayout(new java.awt.BorderLayout());

        jPanel11.setBackground(new java.awt.Color(255, 255, 255));

        tablaU.setFont(new java.awt.Font("Cantarell", 0, 24)); // NOI18N
        tablaU.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Usuario", "UID"
            }
        ));
        tablaU.setRowHeight(40);
        tablaU.setSelectionBackground(new java.awt.Color(102, 0, 0));
        tablaU.setSelectionForeground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setViewportView(tablaU);

        jPanel11.add(jScrollPane1);

        usuarioc.add(jPanel11, java.awt.BorderLayout.CENTER);

        jPanel12.setBackground(new java.awt.Color(255, 255, 255));

        jLabel13.setFont(new java.awt.Font("Cantarell", 3, 36)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(102, 0, 0));
        jLabel13.setText("Usuarios Samba");
        jPanel12.add(jLabel13);

        usuarioc.add(jPanel12, java.awt.BorderLayout.PAGE_START);

        jPanel13.setBackground(new java.awt.Color(255, 255, 255));

        jPanel14.setBackground(new java.awt.Color(102, 0, 0));
        jPanel14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel14MouseClicked(evt);
            }
        });
        jPanel14.setLayout(new java.awt.GridBagLayout());

        jLabel11.setFont(new java.awt.Font("Cantarell", 1, 30)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Agregar");
        jPanel14.add(jLabel11, new java.awt.GridBagConstraints());

        jPanel13.add(jPanel14);

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 169, Short.MAX_VALUE)
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel13.add(jPanel15);

        jPanel16.setBackground(new java.awt.Color(102, 0, 0));
        jPanel16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel16MouseClicked(evt);
            }
        });
        jPanel16.setLayout(new java.awt.GridBagLayout());

        jLabel12.setFont(new java.awt.Font("Cantarell", 1, 30)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Eliminar");
        jPanel16.add(jLabel12, new java.awt.GridBagConstraints());

        jPanel13.add(jPanel16);

        usuarioc.add(jPanel13, java.awt.BorderLayout.PAGE_END);

        contenido.add(usuarioc, "card4");

        añadirc.setLayout(new java.awt.BorderLayout());

        jPanel26.setLayout(new java.awt.BorderLayout());

        jPanel32.setBackground(new java.awt.Color(255, 255, 255));
        jPanel32.setMinimumSize(new java.awt.Dimension(450, 467));
        jPanel32.setPreferredSize(new java.awt.Dimension(450, 461));
        jPanel32.setLayout(new java.awt.GridBagLayout());

        jLabel24.setFont(new java.awt.Font("Cantarell", 3, 36)); // NOI18N
        jLabel24.setText("Identificacion");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(59, 87, 0, 0);
        jPanel32.add(jLabel24, gridBagConstraints);

        jLabel25.setFont(new java.awt.Font("Cantarell", 3, 24)); // NOI18N
        jLabel25.setText("Nombre del recurso compartido");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(53, 87, 0, 129);
        jPanel32.add(jLabel25, gridBagConstraints);

        jLabel26.setFont(new java.awt.Font("Cantarell", 3, 24)); // NOI18N
        jLabel26.setText("Descripcion");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(44, 87, 0, 0);
        jPanel32.add(jLabel26, gridBagConstraints);

        jTextField3.setFont(new java.awt.Font("Cantarell", 0, 24)); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.ipadx = 307;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(42, 87, 0, 129);
        jPanel32.add(jTextField3, gridBagConstraints);

        jTextField4.setFont(new java.awt.Font("Cantarell", 0, 24)); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.ipadx = 307;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 87, 75, 129);
        jPanel32.add(jTextField4, gridBagConstraints);

        jPanel26.add(jPanel32, java.awt.BorderLayout.LINE_START);

        jPanel33.setBackground(new java.awt.Color(255, 255, 255));

        jLabel27.setFont(new java.awt.Font("Cantarell", 3, 24)); // NOI18N
        jLabel27.setText("Tipo de recurso compartido");

        jCheckBox3.setFont(new java.awt.Font("Cantarell", 0, 24)); // NOI18N
        jCheckBox3.setText("Impresora");
        jCheckBox3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jCheckBox3MouseClicked(evt);
            }
        });

        jCheckBox4.setFont(new java.awt.Font("Cantarell", 0, 24)); // NOI18N
        jCheckBox4.setText("Directorio");
        jCheckBox4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jCheckBox4MouseClicked(evt);
            }
        });

        jLabel28.setFont(new java.awt.Font("Cantarell", 3, 24)); // NOI18N
        jLabel28.setText("Ruta del recurso compartido");

        route.setFont(new java.awt.Font("Cantarell", 0, 24)); // NOI18N
        route.setText("/home");

        jCheckBox5.setFont(new java.awt.Font("Cantarell", 0, 24)); // NOI18N
        jCheckBox5.setText("Solo lectura");

        jPanel34.setBackground(new java.awt.Color(102, 0, 0));
        jPanel34.setLayout(new java.awt.GridBagLayout());

        jLabel29.setFont(new java.awt.Font("Cantarell", 1, 30)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(255, 255, 255));
        jLabel29.setText("Buscar");
        jLabel29.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel29MouseClicked(evt);
            }
        });
        jPanel34.add(jLabel29, new java.awt.GridBagConstraints());

        jCheckBox6.setFont(new java.awt.Font("Cantarell", 0, 24)); // NOI18N
        jCheckBox6.setText("Heredar las ACL");

        jCheckBox7.setFont(new java.awt.Font("Cantarell", 0, 24)); // NOI18N
        jCheckBox7.setText("Utilizar caracteristicas de BtrFS");

        javax.swing.GroupLayout jPanel33Layout = new javax.swing.GroupLayout(jPanel33);
        jPanel33.setLayout(jPanel33Layout);
        jPanel33Layout.setHorizontalGroup(
            jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel33Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCheckBox7)
                    .addComponent(jCheckBox6)
                    .addComponent(jLabel27)
                    .addComponent(jCheckBox3)
                    .addComponent(jCheckBox4)
                    .addComponent(jLabel28)
                    .addGroup(jPanel33Layout.createSequentialGroup()
                        .addGroup(jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(route, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jCheckBox5))
                        .addGap(30, 30, 30)
                        .addComponent(jPanel34, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        jPanel33Layout.setVerticalGroup(
            jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel33Layout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addComponent(jLabel27)
                .addGap(18, 18, 18)
                .addComponent(jCheckBox3)
                .addGap(18, 18, 18)
                .addComponent(jCheckBox4)
                .addGap(22, 22, 22)
                .addComponent(jLabel28)
                .addGroup(jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel33Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jPanel34, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel33Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(route, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckBox5)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox7)
                .addContainerGap())
        );

        jPanel26.add(jPanel33, java.awt.BorderLayout.CENTER);

        añadirc.add(jPanel26, java.awt.BorderLayout.CENTER);

        jPanel27.setBackground(new java.awt.Color(255, 255, 255));

        jLabel14.setFont(new java.awt.Font("Cantarell", 3, 36)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(102, 0, 0));
        jLabel14.setText("Nuevo recurso compartido");
        jPanel27.add(jLabel14);

        añadirc.add(jPanel27, java.awt.BorderLayout.PAGE_START);

        jPanel28.setBackground(new java.awt.Color(255, 255, 255));

        jPanel29.setBackground(new java.awt.Color(102, 0, 0));
        jPanel29.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel29MouseClicked(evt);
            }
        });
        jPanel29.setLayout(new java.awt.GridBagLayout());

        jLabel22.setFont(new java.awt.Font("Cantarell", 1, 30)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("Atras");
        jPanel29.add(jLabel22, new java.awt.GridBagConstraints());

        jPanel28.add(jPanel29);

        javax.swing.GroupLayout jPanel30Layout = new javax.swing.GroupLayout(jPanel30);
        jPanel30.setLayout(jPanel30Layout);
        jPanel30Layout.setHorizontalGroup(
            jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 248, Short.MAX_VALUE)
        );
        jPanel30Layout.setVerticalGroup(
            jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel28.add(jPanel30);

        jPanel31.setBackground(new java.awt.Color(102, 0, 0));
        jPanel31.setLayout(new java.awt.GridBagLayout());

        jLabel23.setFont(new java.awt.Font("Cantarell", 1, 30)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("Aceptar");
        jLabel23.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel23MouseClicked(evt);
            }
        });
        jPanel31.add(jLabel23, new java.awt.GridBagConstraints());

        jPanel28.add(jPanel31);

        añadirc.add(jPanel28, java.awt.BorderLayout.PAGE_END);

        contenido.add(añadirc, "card3");

        editarc.setLayout(new java.awt.BorderLayout());

        jPanel35.setBackground(new java.awt.Color(255, 255, 255));
        jPanel35.setLayout(new java.awt.GridBagLayout());

        jTable3.setFont(new java.awt.Font("Cantarell", 0, 24)); // NOI18N
        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Opcion", "Valor"
            }
        ));
        jTable3.setGridColor(new java.awt.Color(255, 255, 255));
        jTable3.setRowHeight(35);
        jTable3.setSelectionBackground(new java.awt.Color(102, 0, 0));
        jTable3.setSelectionForeground(new java.awt.Color(255, 255, 255));
        jScrollPane3.setViewportView(jTable3);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 916;
        gridBagConstraints.ipady = 181;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(71, 6, 0, 0);
        jPanel35.add(jScrollPane3, gridBagConstraints);

        jPanel44.setBackground(new java.awt.Color(255, 255, 255));
        jPanel44.setPreferredSize(new java.awt.Dimension(150, 198));

        javax.swing.GroupLayout jPanel44Layout = new javax.swing.GroupLayout(jPanel44);
        jPanel44.setLayout(jPanel44Layout);
        jPanel44Layout.setHorizontalGroup(
            jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 75, Short.MAX_VALUE)
        );
        jPanel44Layout.setVerticalGroup(
            jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 3;
        gridBagConstraints.ipadx = 75;
        gridBagConstraints.ipady = 412;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(71, 0, 0, 0);
        jPanel35.add(jPanel44, gridBagConstraints);

        jPanel45.setBackground(new java.awt.Color(255, 255, 255));
        jPanel45.setPreferredSize(new java.awt.Dimension(150, 0));

        javax.swing.GroupLayout jPanel45Layout = new javax.swing.GroupLayout(jPanel45);
        jPanel45.setLayout(jPanel45Layout);
        jPanel45Layout.setHorizontalGroup(
            jPanel45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 75, Short.MAX_VALUE)
        );
        jPanel45Layout.setVerticalGroup(
            jPanel45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 3;
        gridBagConstraints.ipadx = 75;
        gridBagConstraints.ipady = 412;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(71, 3, 0, 0);
        jPanel35.add(jPanel45, gridBagConstraints);

        jPanel46.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel46Layout = new javax.swing.GroupLayout(jPanel46);
        jPanel46.setLayout(jPanel46Layout);
        jPanel46Layout.setHorizontalGroup(
            jPanel46Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 926, Short.MAX_VALUE)
        );
        jPanel46Layout.setVerticalGroup(
            jPanel46Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipadx = 926;
        gridBagConstraints.ipady = 100;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 12, 0, 0);
        jPanel35.add(jPanel46, gridBagConstraints);

        editarc.add(jPanel35, java.awt.BorderLayout.CENTER);

        jPanel36.setBackground(new java.awt.Color(255, 255, 255));

        jLabel34.setFont(new java.awt.Font("Cantarell", 3, 36)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(102, 0, 0));
        jLabel34.setText("Recurso compartido :");
        jPanel36.add(jLabel34);

        rec.setFont(new java.awt.Font("Cantarell", 3, 36)); // NOI18N
        rec.setForeground(new java.awt.Color(102, 0, 0));
        rec.setText("Recurso");
        jPanel36.add(rec);

        editarc.add(jPanel36, java.awt.BorderLayout.PAGE_START);

        jPanel37.setBackground(new java.awt.Color(255, 255, 255));

        jPanel38.setBackground(new java.awt.Color(102, 0, 0));
        jPanel38.setLayout(new java.awt.GridBagLayout());

        jLabel30.setFont(new java.awt.Font("Cantarell", 1, 30)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(255, 255, 255));
        jLabel30.setText("Atras");
        jLabel30.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel30MouseClicked(evt);
            }
        });
        jPanel38.add(jLabel30, new java.awt.GridBagConstraints());

        jPanel37.add(jPanel38);

        javax.swing.GroupLayout jPanel39Layout = new javax.swing.GroupLayout(jPanel39);
        jPanel39.setLayout(jPanel39Layout);
        jPanel39Layout.setHorizontalGroup(
            jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 258, Short.MAX_VALUE)
        );
        jPanel39Layout.setVerticalGroup(
            jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel37.add(jPanel39);

        jPanel40.setBackground(new java.awt.Color(102, 0, 0));
        jPanel40.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel40MouseClicked(evt);
            }
        });
        jPanel40.setLayout(new java.awt.GridBagLayout());

        jLabel31.setFont(new java.awt.Font("Cantarell", 1, 30)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(255, 255, 255));
        jLabel31.setText("Añadir");
        jLabel31.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel31MouseClicked(evt);
            }
        });
        jPanel40.add(jLabel31, new java.awt.GridBagConstraints());

        jPanel37.add(jPanel40);

        jPanel41.setBackground(new java.awt.Color(102, 0, 0));
        jPanel41.setLayout(new java.awt.GridBagLayout());

        jLabel32.setFont(new java.awt.Font("Cantarell", 1, 30)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(255, 255, 255));
        jLabel32.setText("Editar");
        jLabel32.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel32MouseClicked(evt);
            }
        });
        jPanel41.add(jLabel32, new java.awt.GridBagConstraints());

        jPanel37.add(jPanel41);

        jPanel42.setBackground(new java.awt.Color(102, 0, 0));
        jPanel42.setLayout(new java.awt.GridBagLayout());

        jLabel33.setFont(new java.awt.Font("Cantarell", 1, 30)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(255, 255, 255));
        jLabel33.setText("Eliminar");
        jLabel33.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel33MouseClicked(evt);
            }
        });
        jPanel42.add(jLabel33, new java.awt.GridBagConstraints());

        jPanel37.add(jPanel42);

        editarc.add(jPanel37, java.awt.BorderLayout.PAGE_END);

        contenido.add(editarc, "card2");

        inferior.add(contenido, java.awt.BorderLayout.CENTER);

        principal.add(inferior, java.awt.BorderLayout.CENTER);

        getContentPane().add(principal, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public void actualizarTablaU() throws IOException{
        m.comando("pdbedit -w -L > "+ubicacionUserTxt);
        System.out.println("actualizado");
        ArrayList<String>aux =m.getTxt(ubicacionUserTxt);
        ArrayList<ArrayList<String>>list=m.dividir(aux,':');
        String data[][]=new String[list.size()][2];
        String nombreColumnas[]={"usuario","UID"};
        for(int i=0;i<list.size();i++){
            data[i][0]=list.get(i).get(0);
            data[i][1]=list.get(i).get(1);
        }
        tablaU.setModel(new DefaultTableModel(data,nombreColumnas));
    }
    public void actualizarInicio() throws IOException{
        m.comando("service smb status > "+ubicacionStatusTxt);
        ArrayList<String> a =m.getTxt(ubicacionStatusTxt);
        //String s = leerEstado(ubicacionStatusTxt);
        int indiceSeleccionado = comboservicio.getSelectedIndex();
        if(a.get(2).contains("inactive")){
            estado.setText("Inactivo(dead)");
            comboservicio.setModel(new DefaultComboBoxModel<>(new String[] { "iniciar", "mantener estado actual" }));
            if(a.get(a.size()-1).contains("Start")){
                comboservicio.setSelectedIndex(0);
            }else{
                comboservicio.setSelectedIndex(1);
            }
        }else{
            estado.setText("Activo(running)");
            comboservicio.setModel(new DefaultComboBoxModel<>(new String[] { "stop","reload","reiniciar", "mantener estado actual" }));
            if(a.get(a.size()-1).contains("Stop")){
                comboservicio.setSelectedIndex(0);
            }else if(a.get(a.size()-1).contains("Reload")){
                comboservicio.setSelectedIndex(1);
            }else if(a.get(a.size()-1).contains("Start")){
                comboservicio.setSelectedIndex(2);
            }else{
                comboservicio.setSelectedIndex(3);
            }
        }
        String reinicio =a.get(1);
        if(reinicio.contains("enabled")){
            comboReinicio.setSelectedIndex(1);
        }else{
            comboReinicio.setSelectedIndex(0);
        }
    }
    public void actualizarIdentidad(){
        try {
            ArrayList<String>aux=m.getSeccion(ubicacionArchivoSmb,"global");
            ArrayList<ArrayList<String>>smbC =m.dividir(aux,'=');
            for(int i = 0; i < aux.size();i++){
                String ha=aux.get(i);
                if(ha.contains("workgroup")||ha.equals("workgroup")){
                    //if(dominio.getText().equals("")||dominio.getText()==null){
                        dominio.setText(smbC.get(i).get(1));
                    //}
                }
                if(ha.contains("wins support")||ha.equals("wins support")){
                    if(smbC.get(i).get(1).contains("Yes")){
                        jCheckBox1.setSelected(true);
                        jCheckBox2.setSelected(false);
                        wins.setText("");
                    }else{
                        jCheckBox1.setSelected(false);
                        jCheckBox2.setSelected(true); 
                    }
                }
                if(ha.contains("wins server")||ha.equals("wins server")){
                    wins.setText(smbC.get(i).get(1));
                }
                wins.setEnabled(jCheckBox2.isSelected());
            }
        } catch (IOException ex) {
            Logger.getLogger(ui.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void actualizarCompartir() throws IOException{
        DefaultTableModel mode = new DefaultTableModel();
        String columnas[] = {"Estado","Solo lectura","Nombre","Ruta","Acceso Invitado","Comentario"};
        mode.setColumnIdentifiers(columnas);
        this.recursos.setModel(mode);
        ArrayList<String> aux = m.getRecursos(ubicacionArchivoSmb);
        for(int i =0; i< aux.size();i++){
            ArrayList<String> aux2 = m.getSeccion(ubicacionArchivoSmb,aux.get(i));
            ArrayList<ArrayList<String>> aux3 =m.dividir(aux2,'=');
            String enviar[] = new String[6];
            for(int j =0;j<aux2.size();j++){
                if(aux3.get(j).get(0).contains("#")){
                    enviar[0]="Inhabilitado";
                  break;  
                }else if(j == aux2.size()-1){
                    enviar[0]="Habilitado";
                }
            }
            for(int j =0;j<aux2.size();j++){
                if(aux3.get(j).get(0).contains("read only")){
                    enviar[1]=aux3.get(j).get(1);
                  break;  
                }else if(j == aux2.size()-1){
                    enviar[1]="No";
                }
            }
            for(int j =0;j<aux2.size();j++){
                if(aux3.get(j).get(0).contains("[")){
                    enviar[2]=aux3.get(j).get(0).replace("[","").replace("]","").replace("#","").trim();
                  break;  
                }else if(j == aux2.size()-1){
                    enviar[2]="";
                }
            }
            for(int j =0;j<aux2.size();j++){
                if(aux3.get(j).get(0).contains("path")&& !aux3.get(j).get(0).contains("logon path")){
                    enviar[3]=aux3.get(j).get(1);
                  break;  
                }else if(j == aux2.size()-1){
                    enviar[3]="";
                }
            }
            for(int j =0;j<aux2.size();j++){
                if(aux3.get(j).get(0).contains("guest ok")){
                    enviar[4]=aux3.get(j).get(1);
                  break;  
                }else if(j == aux2.size()-1){
                    enviar[4]="No";
                }
            }
            for(int j =0;j<aux2.size();j++){
                if(aux3.get(j).get(0).contains("comment")){
                    enviar[5]=aux3.get(j).get(1);
                  break;  
                }else if(j == aux2.size()-1){
                    enviar[5]="";
                }
            }
                mode.addRow(enviar);
        }
        recursos.setModel(mode);
    }
    public void actualizarEditarSeccion(String seccion){
        DefaultTableModel mode = new DefaultTableModel();
        seccion =seccion.replace("#","").trim();
        rec.setText(seccion);
            /////
        String columnas[] = {"Opcion","Valor"};
        mode.setColumnIdentifiers(columnas);
        this.jTable3.setModel(mode);
        String []enviar = new String[2];
        try {
            ArrayList<String>rec = m.getSeccion(ubicacionArchivoSmb,seccion);
            ArrayList<ArrayList<String>> asd = m.dividir(rec,'=');
            for(int i =1;i<asd.size();i++){
                enviar[0] = asd.get(i).get(0).replace("#","").trim();
                enviar[1] = asd.get(i).get(1).replace("#","").trim();
                mode.addRow(enviar);
            }
            } catch (IOException ex) {
                Logger.getLogger(ui.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            jTable3.setModel(mode);
        
    }
    public void btnRad(String permiso){
        if(permiso.length()==4){
            if(permiso.charAt(0) == '0'){
                permiso = permiso.substring(1);
            }
        }
        JPanel usuarioPanel = new JPanel();
        usuarioPanel.setBorder(BorderFactory.createTitledBorder("Permisos para usuarios"));
        JRadioButton btn1 = new JRadioButton("r");
        JRadioButton btn2 = new JRadioButton("w");
        JRadioButton btn3 = new JRadioButton("x");
        usuarioPanel.add(btn1);
        usuarioPanel.add(btn2);
        usuarioPanel.add(btn3);
        JPanel grupoPanel = new JPanel();
        grupoPanel.setBorder(BorderFactory.createTitledBorder("Permisos para grupos"));
        JRadioButton btn4 = new JRadioButton("r");
        JRadioButton btn5 = new JRadioButton("w");
        JRadioButton btn6 = new JRadioButton("x");
        grupoPanel.add(btn4);
        grupoPanel.add(btn5);
        grupoPanel.add(btn6);
        JPanel otroPanel = new JPanel();
        otroPanel.setBorder(BorderFactory.createTitledBorder("Permisos para otros"));
        JRadioButton btn7 = new JRadioButton("r");
        JRadioButton btn8 = new JRadioButton("w");
        JRadioButton btn9 = new JRadioButton("x");
        otroPanel.add(btn7);
        otroPanel.add(btn8);
        otroPanel.add(btn9);
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.PAGE_AXIS));
        panel.add(usuarioPanel);
        panel.add(grupoPanel);
        panel.add(otroPanel);
        /////////////
        char[] permisos = permiso.toCharArray();
        if (permisos.length == 3) {
                if (permisos[0] == '7') {
                    btn1.setSelected(true);
                    btn2.setSelected(true);
                    btn3.setSelected(true);
                }
                if (permisos[0] == '4') {
                    btn1.setSelected(true);
                }
                if (permisos[0] == '2') {
                    btn2.setSelected(true);
                }
                if (permisos[0] == '1') {
                    btn3.setSelected(true);
                }
                if (permisos[0] == '6') {
                    btn1.setSelected(true);
                    btn2.setSelected(true);
                }
                if (permisos[0] == '5') {
                    btn1.setSelected(true);
                    btn3.setSelected(true);
                }
                if (permisos[0] == '3') {
                    btn2.setSelected(true);
                    btn3.setSelected(true);
                }
                
                if (permisos[1] == '7') {
                    btn4.setSelected(true);
                    btn5.setSelected(true);
                    btn6.setSelected(true);
                }
                if (permisos[1] == '4') {
                    btn4.setSelected(true);
                }
                if (permisos[1] == '2') {
                    btn5.setSelected(true);
                }
                if (permisos[1] == '1') {
                    btn6.setSelected(true);
                }
                if (permisos[1] == '6') {
                    btn4.setSelected(true);
                    btn5.setSelected(true);
                }
                if (permisos[1] == '5') {
                    btn4.setSelected(true);
                    btn6.setSelected(true);
                }
                if (permisos[1] == '3') {
                    btn5.setSelected(true);
                    btn6.setSelected(true);
                }
                
                if (permisos[2] == '7') {
                    btn7.setSelected(true);
                    btn8.setSelected(true);
                    btn9.setSelected(true);
                }
                if (permisos[2] == '4') {
                    btn7.setSelected(true);
                }
                if (permisos[2] == '2') {
                    btn8.setSelected(true);
                }
                if (permisos[2] == '1') {
                    btn9.setSelected(true);
                }
                if (permisos[2] == '6') {
                    btn7.setSelected(true);
                    btn8.setSelected(true);
                }
                if (permisos[2] == '5') {
                    btn7.setSelected(true);
                    btn9.setSelected(true);
                }
                if (permisos[2] == '3') {
                    btn8.setSelected(true);
                    btn9.setSelected(true);
                }
        }
        /////////////
        JOptionPane.showMessageDialog(this,panel);
        boolean[] usuarioPermisos = {btn1.isSelected(), btn2.isSelected(), btn3.isSelected()};
        boolean[] grupoPermisos = {btn4.isSelected(), btn5.isSelected(), btn6.isSelected()};
        boolean[] otroPermisos = {btn7.isSelected(), btn8.isSelected(), btn9.isSelected()};
    
        // Calcular el valor numérico para cada conjunto de permisos
        int usuarioCodigo = calcularCodigo(usuarioPermisos);
        int grupoCodigo = calcularCodigo(grupoPermisos);
        int otroCodigo = calcularCodigo(otroPermisos);
    
        // Concatenar los códigos numéricos para formar el código completo
        this.codigoPermiso = String.format("%d%d%d", usuarioCodigo, grupoCodigo, otroCodigo);
    
        // Mostrar el código resultante
        JOptionPane.showMessageDialog(this, "El código de permisos seleccionado es: " + codigoPermiso);
    }
    private int calcularCodigo(boolean[] permisos) {
        int codigo = 0;
        if (permisos[0]) {
            codigo += 4; // Lectura
        }
        if (permisos[1]) {
            codigo += 2; // Escritura
        }
        if (permisos[2]) {
            codigo += 1; // Ejecución
        }
        return codigo;
    }
    private void inicioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_inicioMouseClicked
        contenido.removeAll();
        contenido.add(inicioc);
        contenido.repaint();
        contenido.revalidate();
        inicio.setBackground(new Color(102,0,0));
        compartir.setBackground(new Color(204,204,204));
        identidad.setBackground(new Color(204,204,204));
        usuario.setBackground(new Color(204,204,204));
        inicioo.setForeground(Color.WHITE);
        compartiro.setForeground(Color.BLACK);
        identidado.setForeground(Color.BLACK);
        usuarioo.setForeground(Color.BLACK);
        try {
            actualizarInicio();
        } catch (IOException ex) {
            Logger.getLogger(ui.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_inicioMouseClicked

    private void compartirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_compartirMouseClicked
        contenido.removeAll();
        contenido.add(compartirc);
        contenido.repaint();
        contenido.revalidate();
        inicio.setBackground(new Color(204,204,204));
        compartir.setBackground(new Color(102,0,0));
        identidad.setBackground(new Color(204,204,204));
        usuario.setBackground(new Color(204,204,204));
        inicioo.setForeground(Color.BLACK);
        compartiro.setForeground(Color.WHITE);
        identidado.setForeground(Color.BLACK);
        usuarioo.setForeground(Color.BLACK);
        try {
            actualizarCompartir();
        } catch (IOException ex) {
            Logger.getLogger(ui.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_compartirMouseClicked

    private void identidadMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_identidadMouseClicked
        contenido.removeAll();
        contenido.add(identidadc);
        contenido.repaint();
        contenido.revalidate();
        inicio.setBackground(new Color(204,204,204));
        compartir.setBackground(new Color(204,204,204));
        identidad.setBackground(new Color(102,0,0));
        usuario.setBackground(new Color(204,204,204));
        inicioo.setForeground(Color.BLACK);
        compartiro.setForeground(Color.BLACK);
        identidado.setForeground(Color.WHITE);
        usuarioo.setForeground(Color.BLACK);
        actualizarIdentidad();
    }//GEN-LAST:event_identidadMouseClicked

    private void usuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_usuarioMouseClicked
        contenido.removeAll();
        contenido.add(usuarioc);
        contenido.repaint();
        contenido.revalidate();
        inicio.setBackground(new Color(204,204,204));
        compartir.setBackground(new Color(204,204,204));
        identidad.setBackground(new Color(204,204,204));
        usuario.setBackground(new Color(102,0,0));
        inicioo.setForeground(Color.BLACK);
        compartiro.setForeground(Color.BLACK);
        identidado.setForeground(Color.BLACK);
        usuarioo.setForeground(Color.WHITE);
        try {
            actualizarTablaU();
        } catch (IOException ex) {
            Logger.getLogger(ui.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_usuarioMouseClicked

    private void dominioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dominioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dominioActionPerformed

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void jCheckBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox2ActionPerformed

    private void jLabel15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel15MouseClicked
        contenido.removeAll();
        contenido.add(añadirc);
        contenido.repaint();
        contenido.revalidate();
        jTextField3.setText("");
        jTextField4.setText("");
        jCheckBox4.setSelected(true);
        jCheckBox3.setSelected(false);
        route.setEnabled(true);
        route.setText("/home");
        jCheckBox5.setSelected(false);
        jCheckBox6.setSelected(false);
        jCheckBox7.setSelected(false);
        jCheckBox5.setEnabled(true);
        jCheckBox6.setEnabled(true);
        jPanel34.setBackground(new Color(102,0,0));
        jLabel29.setForeground(Color.WHITE);
        
    }//GEN-LAST:event_jLabel15MouseClicked

    private void jPanel29MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel29MouseClicked
        contenido.removeAll();
        contenido.add(compartirc);
        contenido.repaint();
        contenido.revalidate();
    }//GEN-LAST:event_jPanel29MouseClicked

    private void jLabel30MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel30MouseClicked
        contenido.removeAll();
        contenido.add(compartirc);
        contenido.repaint();
        contenido.revalidate();
        try {
            actualizarCompartir();
        } catch (IOException ex) {
            Logger.getLogger(ui.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jLabel30MouseClicked

    private void jPanel40MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel40MouseClicked
        
    }//GEN-LAST:event_jPanel40MouseClicked

    private void jPanel14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel14MouseClicked
        String user = JOptionPane.showInputDialog(this,"usuario");
            String contra = JOptionPane.showInputDialog(this,"contraseña para : "+user);
            if(m.crearUsuarioSmb(user, contra)){
                JOptionPane.showMessageDialog(this,"Usuario agregado");
            try {
                actualizarTablaU();
            } catch (IOException ex) {
                Logger.getLogger(ui.class.getName()).log(Level.SEVERE, null, ex);
            }
            }else{
                JOptionPane.showMessageDialog(this,"NO existe el usuario");
            }
    }//GEN-LAST:event_jPanel14MouseClicked

    private void jPanel16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel16MouseClicked
        int filaSeleccionada = tablaU.getSelectedRow(); // Obtener la fila seleccionada
        int columnaSeleccionada = 0;
        String user = (String) tablaU.getValueAt(filaSeleccionada, columnaSeleccionada);
        try {
            int sera = JOptionPane.showConfirmDialog(this,"Seguro que quiere eliminar ?");
            if(sera==0){
                if(m.eliminarUsuarioSmb(user)){
                    JOptionPane.showMessageDialog(this,"Usuario eliminado");
                    actualizarTablaU();
                }else{
                    JOptionPane.showMessageDialog(this,"error al eliminar");
                }
            }
            
        } catch (IOException ex) {
            Logger.getLogger(ui.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jPanel16MouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        // aceptar
        try {
            int indiceSeleccionado = comboservicio.getSelectedIndex();
                ArrayList<String> a =m.getTxt(ubicacionStatusTxt);
                
                if(a.get(2).contains("inactive")){
                    if(indiceSeleccionado ==0){
                    m.comando("service smb start");
                    }
                }else{
                    switch(indiceSeleccionado){
                    case 0:
                        m.comando("service smb stop");
                        break;
                    case 1: 
                        m.comando("service smb reload");
                        break;
                    case 2:   
                        m.comando("service smb restart");
                        break;
                    default:
                        break;
                    }
                }
                int r = comboReinicio.getSelectedIndex();
                if(r == 1 && !a.get(1).contains("enabled") ){
                     m.comando("systemctl enable smb");
                }else if(r == 0 && a.get(1).contains("enabled")){
                        m.comando("systemctl disable smb");
                }
                JOptionPane.showMessageDialog(this,"Guardado");
                actualizarInicio();
                //JOptionPane.showMessageDialog(this,"opcion elegida : "+indiceSeleccionado);
        } catch (IOException ex) {
            Logger.getLogger(ui.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        // aceptar
        try {
            ArrayList<String>aux=m.getSeccion(ubicacionArchivoSmb,"global");
            ArrayList<ArrayList<String>>smbC =m.dividir(aux,'=');
            for(int i = 0; i<smbC.size();i++){
                if(smbC.get(i).get(0).contains("workgroup")){
                    if(!smbC.get(i).get(1).equals(dominio.getText())){
                        m.editarAtributo(ubicacionArchivoSmb, "global","workgroup", dominio.getText());
                    }
                    break;
                }else if(i == smbC.size()-1){
                    m.editarAtributo(ubicacionArchivoSmb, "global","workgroup", dominio.getText());
                }
                
            }
            if(jCheckBox1.isSelected()){
                m.editarAtributo(ubicacionArchivoSmb, "global","wins support","Yes");
                m.eliminarAtributo(ubicacionArchivoSmb, "global","wins server");
            }else if(jCheckBox2.isSelected()){
                m.editarAtributo(ubicacionArchivoSmb, "global","wins support","No");
                if(!wins.getText().equals("")){
                    m.editarAtributo(ubicacionArchivoSmb, "global","wins server",wins.getText());
                }else{
                    m.eliminarAtributo(ubicacionArchivoSmb, "global","wins server");
                }
            }else{
                m.editarAtributo(ubicacionArchivoSmb, "global","wins support","No");
                m.eliminarAtributo(ubicacionArchivoSmb, "global","wins server");
            }
            JOptionPane.showMessageDialog(this,"guardado");
            actualizarIdentidad();
        } catch (IOException ex) {
            Logger.getLogger(ui.class.getName()).log(Level.SEVERE, null, ex);
        }   
    }//GEN-LAST:event_jLabel7MouseClicked

    private void jCheckBox1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCheckBox1MouseClicked
        wins.setEnabled(false);
        jCheckBox2.setSelected(false);
    }//GEN-LAST:event_jCheckBox1MouseClicked

    private void jCheckBox2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCheckBox2MouseClicked
        wins.setEnabled(jCheckBox2.isSelected());
        jCheckBox1.setSelected(false);
    }//GEN-LAST:event_jCheckBox2MouseClicked

    private void jLabel19MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel19MouseClicked
        // cambiar estado
        int filaSeleccionada = recursos.getSelectedRow();
        int columnaSeleccionada = 2;
        if (filaSeleccionada != -1) {
            String s = (String) recursos.getValueAt(filaSeleccionada, columnaSeleccionada);
            s=s.replace("#","").trim();
            int opcion = JOptionPane.showConfirmDialog(this, "¿Estás seguro de cambiar estado? "+s, "Confirmación", JOptionPane.YES_NO_OPTION);
            if(opcion == 0){
                try {
                    m.cambiarEstado(ubicacionArchivoSmb, s);
                    actualizarCompartir();
                } catch (IOException ex) {
                    Logger.getLogger(ui.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }else{
            JOptionPane.showMessageDialog(this,"seleccione un recurso");
        }
    }//GEN-LAST:event_jLabel19MouseClicked

    private void jLabel18MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel18MouseClicked
        // acceso invitado
        int filaSeleccionada = recursos.getSelectedRow();
        int columnaSeleccionada = 2;
        if (filaSeleccionada != -1) {
            String s = (String) recursos.getValueAt(filaSeleccionada, columnaSeleccionada);
            String cont =(String) recursos.getValueAt(filaSeleccionada, 4);
            cont = cont.replace("#","").trim();
            s=s.replace("#","").trim();
            int opcion =1;
            if(cont.equals("Yes")){
                opcion = JOptionPane.showConfirmDialog(this, "Estás seguro de cambiar acceso de invitado de "+s+" a No", "Confirmación", JOptionPane.YES_NO_OPTION);
            }else{
                opcion = JOptionPane.showConfirmDialog(this, "Estás seguro de cambiar acceso de invitado de "+s+" a Yes", "Confirmación", JOptionPane.YES_NO_OPTION);
            }
            if(opcion == 0){
                try {
                    if(cont.equals("Yes")){
                        m.editarAtributo(ubicacionArchivoSmb, s,"guest ok","No");
                    }else{
                        m.editarAtributo(ubicacionArchivoSmb, s,"guest ok","Yes");
                    }
                    actualizarCompartir();
                } catch (IOException ex) {
                    Logger.getLogger(ui.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }else{
            JOptionPane.showMessageDialog(this,"seleccione un recurso");
        }
    }//GEN-LAST:event_jLabel18MouseClicked

    private void jLabel17MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel17MouseClicked
        int filaSeleccionada = recursos.getSelectedRow();
        int columnaSeleccionada = 2;
        if (filaSeleccionada != -1) {
            String s = (String) recursos.getValueAt(filaSeleccionada, columnaSeleccionada);
            s=s.replace("#","").trim();
            String rename = JOptionPane.showInputDialog("Nuevo Nombre");
            //JOptionPane.showMessageDialog(this,rename);
            rename =rename.replace("#","").trim();
            try {
                m.editarAtributo(ubicacionArchivoSmb, s, s, rename);
                actualizarCompartir();
            } catch (IOException ex) {
                Logger.getLogger(ui.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else{
            JOptionPane.showMessageDialog(this,"seleccione un recurso");
        }
    }//GEN-LAST:event_jLabel17MouseClicked

    private void jLabel16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel16MouseClicked
        // eliminar seccion
        int filaSeleccionada = recursos.getSelectedRow();
        int columnaSeleccionada = 2;
        if (filaSeleccionada != -1) {
            String s = (String) recursos.getValueAt(filaSeleccionada, columnaSeleccionada);
            s = s.replace("#","");
            int opcion = JOptionPane.showConfirmDialog(this, "¿Estás seguro de que deseas eliminar esta seccion ? "+s, "Confirmación", JOptionPane.YES_NO_OPTION);
            if(opcion == 0){
                try {
                    m.eliminarSeccion(ubicacionArchivoSmb,s);
                    actualizarCompartir();
                } catch (IOException ex) {
                    Logger.getLogger(ui.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }else{
            JOptionPane.showMessageDialog(this,"seleccione un recurso");
        }
    }//GEN-LAST:event_jLabel16MouseClicked

    private void jLabel33MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel33MouseClicked
        // eliminar atributo
        int filaSeleccionada = jTable3.getSelectedRow();
        int columnaSeleccionada = 0;
        if (filaSeleccionada != -1) {
            //jLabel28
            String s = (String) jTable3.getValueAt(filaSeleccionada, columnaSeleccionada);
            s = s.replace("#","");
            int borrar = JOptionPane.showConfirmDialog(this, "¿Estás seguro de que deseas eliminar este atributo ? "+s, "Confirmación", JOptionPane.YES_NO_OPTION);
            if(borrar == 0){
                try {
                    m.eliminarAtributo(ubicacionArchivoSmb,rec.getText().replace("#","").trim(),s);
                    //jLabel27MouseClicked(evt);
                    actualizarEditarSeccion(rec.getText().replace("#","").trim());
                } catch (IOException ex) {
                    Logger.getLogger(ui.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }else{
            JOptionPane.showMessageDialog(this, "Seleccione un atributo");
        }
    }//GEN-LAST:event_jLabel33MouseClicked

    private void jLabel32MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel32MouseClicked
        //editar atributo
        int filaSeleccionada = jTable3.getSelectedRow();
        int columnaSeleccionada = 0;
        if (filaSeleccionada != -1) {
            String s = (String) jTable3.getValueAt(filaSeleccionada, columnaSeleccionada);
            String ss =(String) jTable3.getValueAt(filaSeleccionada,1);
            s = s.replace("#","").trim();
            ArrayList<String> atributos1=new ArrayList<String>();
            ArrayList<String> atributos2=new ArrayList<String>();
            atributos1.add("load printers");
            atributos1.add("preferred master");
            atributos1.add("browseable");
            atributos1.add("writeable");
            atributos1.add("printable");
            atributos1.add("guest ok");
            atributos1.add("writable");
            atributos1.add("locking");
            atributos1.add("afs share");
            atributos1.add("available");
            atributos1.add("blocking locks");
            atributos1.add("case sensitive");
            atributos1.add("casesignames");
            atributos1.add("default devmode");
            atributos1.add("delete readonly");
            atributos1.add("delete veto files");
            atributos1.add("dos filetime resolution");
            atributos1.add("dos filemode");
            atributos1.add("dos filetimes");
            atributos1.add("ea support");
            atributos1.add("browsable");
            atributos1.add("store dos attributes");
            atributos1.add("read only");
            atributos1.add("inherit acls");
            atributos1.add("wins support");
            atributos1.add("usershare allow guests");
            atributos2.add("create mask");
            atributos2.add("directory mask");
            boolean aceptado = false;
            for(int i =0 ; i<atributos1.size();i++){
                if(atributos1.get(i).equals(s)||atributos1.get(i).contains(s)){
                    JRadioButton es =new JRadioButton(s);
                    JPanel y = new JPanel();
                    y.setBorder(BorderFactory.createTitledBorder("Opcion actual : "+s));
                    if(ss.contains("Yes")){
                        es.setSelected(true);
                    }else{
                        es.setSelected(false);
                    }
                    y.add(es);
                    JOptionPane.showMessageDialog(this,y);
                    if(es.isSelected()&&ss.contains("No")){
                        try {
                            m.editarAtributo(ubicacionArchivoSmb,rec.getText().trim(),s,"Yes");
                            JOptionPane.showMessageDialog(this,"Cambiado correctamente");
                            actualizarEditarSeccion(rec.getText().trim());
                        } catch (IOException ex) {
                            Logger.getLogger(ui.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }else if(!es.isSelected()&&ss.contains("Yes")){
                        try {
                            m.editarAtributo(ubicacionArchivoSmb,rec.getText().trim(),s,"No");
                            JOptionPane.showMessageDialog(this,"Cambiado correctamente");
                            actualizarEditarSeccion(rec.getText().trim());
                        } catch (IOException ex) {
                            Logger.getLogger(ui.class.getName()).log(Level.SEVERE, null, ex);
                        }
                            
                    } 
                    aceptado = true;
                    break;
                }
            }
            if(aceptado == false){
                for(int i =0 ; i<atributos2.size();i++){
                    if(atributos2.get(i).equals(s)||atributos2.get(i).contains(s)){
                        aceptado = true;
                        btnRad(ss);
                        try {
                            m.editarAtributo(ubicacionArchivoSmb,rec.getText().trim(),s,"0"+codigoPermiso.trim());
                            JOptionPane.showMessageDialog(this,"Cambiado correctamente");
                            //jLabel27MouseClicked(evt);
                            actualizarEditarSeccion(rec.getText().trim());
                            this.codigoPermiso="";
                        } catch (IOException ex) {
                            Logger.getLogger(ui.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        break;
                    }
                }   
            }
            if(aceptado == false){
                String rqp =JOptionPane.showInputDialog("Opcion "+s,ss);
                if(!ss.contains(rqp)||!ss.equals(rqp)){
                    try {
                        m.editarAtributo(ubicacionArchivoSmb,rec.getText().trim(), s, rqp);
                        JOptionPane.showMessageDialog(this,"Cambiado correctamente");
                        actualizarEditarSeccion(rec.getText().trim());
                    } catch (IOException ex) {
                        Logger.getLogger(ui.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        }else{
           JOptionPane.showMessageDialog(this,"elija un elemento");
        }
    }//GEN-LAST:event_jLabel32MouseClicked

    private void jLabel31MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel31MouseClicked
        // añadir atributo
        String sec = rec.getText().trim();
        String [] re ={"load printers","load printers","browseable","writeable","printable","guest ok",
        "writable","locking","afs share","available","blocking locks","case sensitive","casesignames",
        "default devmode","delete readonly","delete veto files","dos filetime resolution","dos filemode",
        "dos filetimes","ea support","browsable","store dos attributes","read only","inherit acls","wins support"
        ,"usershare allow guests","create mask","directory mask","comment","valid users","workgroup","passdb backend",
        "printing","printcap name","printcap cache time","cups options","map to guest","logon path","logon home",
        "logon drive","wins server","path","block size","allow host","admin users","vfs objects","valid users","write list"
        ,"force group"};
        ArrayList<String>aux = new ArrayList<String>();
        for(int i = 0 ;i<26;i++){
            aux.add(re[i]);/////yes o no
        }
        JComboBox<String> comboBox = new JComboBox<String>(re);
        //JOptionPane.showMessageDialog(this, comboBox, "Selecciona una opción", JOptionPane.QUESTION_MESSAGE);
        int opcion = JOptionPane.showOptionDialog(null, comboBox, "Selecciona una opción",
            JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, null, null);
        //JOptionPane.showMessageDialog(this,"Opcion seleccionada : "+opcionSeleccionada);
        if(opcion ==0){
            String opcionSeleccionada = (String) comboBox.getSelectedItem();
            boolean encontrado =false;
            for(int e = 0; e<aux.size();e++){
                if(aux.get(e).equals(opcionSeleccionada.trim())){
                    JRadioButton es =new JRadioButton(opcionSeleccionada);
                    JPanel y = new JPanel();
                    y.setBorder(BorderFactory.createTitledBorder("Opcion actual : "+opcionSeleccionada));
                    y.add(es);
                    //JOptionPane.showMessageDialog(this,y);
                    int o = JOptionPane.showOptionDialog(this, y, "Yes o No",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, null, null);
                         
                    if(o==0){
                        if(es.isSelected()){
                        //JOptionPane.showMessageDialog(this,"la seccion es : "+jLabel28.getText().trim()+" "+s+ " "+ss);
                        try {
                            m.editarAtributo(ubicacionArchivoSmb,rec.getText().trim(),opcionSeleccionada,"Yes");
                            JOptionPane.showMessageDialog(this,"Agregado correctamente");
                            //jLabel27MouseClicked(evt);
                            actualizarEditarSeccion(rec.getText().trim());
                            } catch (IOException ex) {
                                Logger.getLogger(ui.class.getName()).log(Level.SEVERE, null, ex);
                            }
                        }else if(!es.isSelected()){
                            try {
                                m.editarAtributo(ubicacionArchivoSmb,rec.getText().trim(),opcionSeleccionada,"No");
                                JOptionPane.showMessageDialog(this,"Agregado correctamente");
                                actualizarEditarSeccion(rec.getText().trim());
                            } catch (IOException ex) {
                                Logger.getLogger(ui.class.getName()).log(Level.SEVERE, null, ex);
                            } 
                        }
                    }
                    encontrado =true;
                    break;
                }
            }
            if(encontrado == false){
                if(opcionSeleccionada.equals("create mask")||opcionSeleccionada.equals("directory mask")){
                    btnRad("0");
                        try {
                            m.editarAtributo(ubicacionArchivoSmb,rec.getText().trim(),opcionSeleccionada,"0"+codigoPermiso.trim());
                            JOptionPane.showMessageDialog(this,"Agregado correctamente");
                            actualizarEditarSeccion(rec.getText().trim());
                            this.codigoPermiso="";
                        } catch (IOException ex) {
                            Logger.getLogger(ui.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    encontrado = true;
                }
            }
            if(encontrado == false&&opcionSeleccionada.contains("wins server")){
                String rqp =JOptionPane.showInputDialog("Opcion "+opcionSeleccionada);
                try {
                    if(!rqp.equals("")){
                        m.editarAtributo(ubicacionArchivoSmb,rec.getText().trim(),"wins support","No");
                        m.editarAtributo(ubicacionArchivoSmb,rec.getText().trim(),"wins server", rqp.trim());
                        JOptionPane.showMessageDialog(this,"Agregado correctamente");
                    }else{
                        JOptionPane.showMessageDialog(this,"este campo no debe estar vacio");
                    }
                    
                } catch (IOException ex) {
                    Logger.getLogger(ui.class.getName()).log(Level.SEVERE, null, ex);
                }
                encontrado = true;
            }
            
            if(encontrado == false){
                String rqp =JOptionPane.showInputDialog("Opcion "+opcionSeleccionada);
                    try {
                        m.editarAtributo(ubicacionArchivoSmb,rec.getText().trim(),opcionSeleccionada, rqp);
                        JOptionPane.showMessageDialog(this,"Agregado correctamente");
                        actualizarEditarSeccion(rec.getText().trim());
                    } catch (IOException ex) {
                        Logger.getLogger(ui.class.getName()).log(Level.SEVERE, null, ex);
                    }
            }
        }
    }//GEN-LAST:event_jLabel31MouseClicked

    private void jLabel23MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel23MouseClicked
        // aceptar añadir seccion
        String nom = jTextField3.getText();
        nom = nom.replace("#","").trim();
        if(nom.equals("")||nom == null){
            JOptionPane.showMessageDialog(this, "Escriba el nombre");
        }else{
            try {
                if(jCheckBox3.isSelected()){
                    m.editarTxt("["+nom+"]", ubicacionArchivoSmb);
                    if(!jTextField4.getText().equals("")){
                        m.editarAtributo(ubicacionArchivoSmb, nom,"comment",jTextField4.getText());
                    }
                    m.editarAtributo(ubicacionArchivoSmb, nom,"path","/var/tmp");
                    m.editarAtributo(ubicacionArchivoSmb, nom,"printable","Yes");
                    if(jCheckBox7.isSelected()){
                        m.editarAtributo(ubicacionArchivoSmb, nom,"vfs objects","btrfs");
                    }
                    JOptionPane.showMessageDialog(this, "Agregado correctamente");
                    contenido.removeAll();
                    contenido.add(compartirc);
                    contenido.repaint();
                    contenido.revalidate();
                    actualizarCompartir();
                }else if(jCheckBox4.isSelected()&&!route.getText().equals("")){
                    m.editarTxt("["+nom+"]", ubicacionArchivoSmb);
                    if(!jTextField4.getText().equals("")){
                        m.editarAtributo(ubicacionArchivoSmb, nom,"comment",jTextField4.getText());
                        //JOptionPane.showMessageDialog(this, "hola");
                    }
                    m.editarAtributo(ubicacionArchivoSmb, nom,"path",route.getText().trim());
                    if(jCheckBox5.isSelected()){
                        m.editarAtributo(ubicacionArchivoSmb, nom,"read only","Yes");
                    }
                    if(jCheckBox6.isSelected()){
                        m.editarAtributo(ubicacionArchivoSmb, nom,"inherit acls","Yes");
                    }
                    if(jCheckBox7.isSelected()){
                        m.editarAtributo(ubicacionArchivoSmb, nom,"vfs objects","btrfs");
                    }
                    JOptionPane.showMessageDialog(this, "Agregado correctamente");
                    contenido.removeAll();
                    contenido.add(compartirc);
                    contenido.repaint();
                    contenido.revalidate();
                    actualizarCompartir();
                }else{
                    JOptionPane.showMessageDialog(this, "Escriba la ruta");
                }
                
            } catch (IOException ex) {
                Logger.getLogger(ui.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jLabel23MouseClicked

    private void jCheckBox3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCheckBox3MouseClicked
        jCheckBox4.setSelected(false);
        route.setText("");
        route.setEnabled(false);
        jCheckBox5.setSelected(false);
        jCheckBox5.setEnabled(false);
        jPanel34.setBackground(new Color(255,255,255));
        jLabel29.setForeground(new Color(255,255,255));
        jCheckBox6.setSelected(false);
        jCheckBox6.setEnabled(false);
    }//GEN-LAST:event_jCheckBox3MouseClicked

    private void jCheckBox4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCheckBox4MouseClicked
        jCheckBox3.setSelected(false);
        route.setEnabled(true);
        jCheckBox5.setEnabled(true);
        jCheckBox6.setEnabled(true);
        jPanel34.setBackground(new Color(102,0,0));
        jLabel29.setForeground(Color.WHITE);
    }//GEN-LAST:event_jCheckBox4MouseClicked

    private void jLabel29MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel29MouseClicked
        if(!jCheckBox3.isSelected()){
            JFileChooser fc = new JFileChooser();
            fc.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);

            FileNameExtensionFilter filtro = new FileNameExtensionFilter("Archivos de texto","txt");
            fc.setFileFilter(filtro);

            int res = fc.showOpenDialog(this);
            if(res != JFileChooser.CANCEL_OPTION){
                File name = fc.getSelectedFile();

                if((name == null) || name.getName().equals("")){
                    JOptionPane.showMessageDialog(this, "Error al abrir el archivo");
                }else{
                    route.setText(name.getAbsolutePath());
                }
            
            }
        }
    }//GEN-LAST:event_jLabel29MouseClicked

    private void jLabel20MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel20MouseClicked
        int filaSeleccionada = recursos.getSelectedRow();
        int columna =2;
        if (filaSeleccionada != -1) {
            contenido.removeAll();
            contenido.add(editarc);
            contenido.repaint();
            contenido.revalidate();
            String seccion =(String)recursos.getValueAt(filaSeleccionada, columna);
            actualizarEditarSeccion(seccion);
        }else{
            JOptionPane.showMessageDialog(this,"seleccione un recurso");
        }
    }//GEN-LAST:event_jLabel20MouseClicked

    private void comboservicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboservicioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboservicioActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new ui().setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(ui.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel TituloSuperior;
    private javax.swing.JPanel añadirc;
    private javax.swing.JComboBox<String> comboReinicio;
    private javax.swing.JComboBox<String> comboservicio;
    private javax.swing.JPanel compartir;
    private javax.swing.JPanel compartirc;
    private javax.swing.JLabel compartiro;
    private javax.swing.JPanel contenido;
    private javax.swing.JTextField dominio;
    private javax.swing.JPanel editarc;
    private javax.swing.JPanel espacio1;
    private javax.swing.JPanel espacio2;
    private javax.swing.JPanel espacio3;
    private javax.swing.JLabel estado;
    private javax.swing.JPanel identidad;
    private javax.swing.JPanel identidadc;
    private javax.swing.JLabel identidado;
    private javax.swing.JPanel inferior;
    private javax.swing.JPanel inicio;
    private javax.swing.JPanel inicioc;
    private javax.swing.JLabel inicioo;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JCheckBox jCheckBox4;
    private javax.swing.JCheckBox jCheckBox5;
    private javax.swing.JCheckBox jCheckBox6;
    private javax.swing.JCheckBox jCheckBox7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel25;
    private javax.swing.JPanel jPanel26;
    private javax.swing.JPanel jPanel27;
    private javax.swing.JPanel jPanel28;
    private javax.swing.JPanel jPanel29;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel30;
    private javax.swing.JPanel jPanel31;
    private javax.swing.JPanel jPanel32;
    private javax.swing.JPanel jPanel33;
    private javax.swing.JPanel jPanel34;
    private javax.swing.JPanel jPanel35;
    private javax.swing.JPanel jPanel36;
    private javax.swing.JPanel jPanel37;
    private javax.swing.JPanel jPanel38;
    private javax.swing.JPanel jPanel39;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel40;
    private javax.swing.JPanel jPanel41;
    private javax.swing.JPanel jPanel42;
    private javax.swing.JPanel jPanel43;
    private javax.swing.JPanel jPanel44;
    private javax.swing.JPanel jPanel45;
    private javax.swing.JPanel jPanel46;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTable3;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JPanel opcion;
    private javax.swing.JPanel principal;
    private javax.swing.JLabel rec;
    private javax.swing.JTable recursos;
    private javax.swing.JTextField route;
    private javax.swing.JPanel superior;
    private javax.swing.JTable tablaU;
    private javax.swing.JPanel usuario;
    private javax.swing.JPanel usuarioc;
    private javax.swing.JLabel usuarioo;
    private javax.swing.JTextField wins;
    // End of variables declaration//GEN-END:variables
}
