/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import dominio.PlanDeAlimentacion;
import dominio.Sistema;
import dominio.Usuario;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Image;
import java.util.Calendar;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Admin
 */
public class PanelHomeDeUsuario extends javax.swing.JFrame {

    /**
     * Creates new form Home
     */
    private Sistema sistema;
    private final JPanel panelConsulta;
    private final JPanel panelPlanAlimentacionUsuario;
    private final JPanel panelPerfilUsuario;
    private final JPanel panelComidaAdieta;
    private JFrame ventana;
    private JPanel panelActual;
    private Usuario usuarioActual;
    private final JPanel buzon;

    
    
    public ImageIcon scaleImage(ImageIcon icon, int w, int h)
    {
        int nw = icon.getIconWidth();
        int nh = icon.getIconHeight();

        if(icon.getIconWidth() > w)
        {
          nw = w;
          nh = (nw * icon.getIconHeight()) / icon.getIconWidth();
        }

        if(nh > h)
        {
          nh = h;
          nw = (icon.getIconWidth() * nh) / icon.getIconHeight();
        }

        return new ImageIcon(icon.getImage().getScaledInstance(nw, nh, Image.SCALE_DEFAULT));
    }
    
    
    
    
    public PanelHomeDeUsuario(Sistema unSistema, JFrame unaVentana, String persona) {
        initComponents();
        sistema = unSistema;
        ventana = unaVentana;
        this.panelActual = panelHome;
        setColor(btn_1);
        ind_1.setOpaque(true);
        resetColor(new JPanel[]{btn_2, btn_3, btn_4, btn_1, btn_6}, new JPanel[]{ind_2, ind_3, ind_4, ind_1, ind_6});
        jProgressBar1.setValue(50);
        try {
            usuarioActual = this.sistema.getListaUsuarios().get(Integer.parseInt(persona));
            this.jLabel12.setText(usuarioActual.getNombreUsuario());
            ImageIcon imageIcon = scaleImage(usuarioActual.getFotoPerfil(),200,200);
            etiquetaFoto.setIcon(imageIcon);
        } catch (NumberFormatException e) {
            this.jLabel12.setText("Error al encontrar el usuario");
        }
        if(usuarioActual.getProfesionalAsignado()!=null){
              jLabel6.setText("Plan de Alimentacion asignado por : "+ usuarioActual.getProfesionalAsignado().getNombre()+" "
                + usuarioActual.getProfesionalAsignado().getApellidos() );
        }else{
               jLabel6.setText("No tienes ningun plan de alimentacion:");
        }
      
        setIconImage(new ImageIcon(getClass().getResource("/imagenes/icono.png")).getImage());
        listaComidasPlan.setListData(usuarioActual.getPlan().getListaLunes().toArray());
        panelConsulta = new PanelRedactarConsulta(sistema, usuarioActual);
        panelComidaAdieta = new PanelDietaDiariaUsuario(sistema, this, usuarioActual);
        panelPerfilUsuario = new PanelPerfilUsuarioDesdeUsuario(sistema, this, usuarioActual);
        panelPlanAlimentacionUsuario = new PanelPlanAlimentacionUsuario(sistema, ventana, usuarioActual);
        buzon = new PanelConsultaProfesional(sistema, ventana, usuarioActual);
        this.labelMensajes.setText(labelMensajes.getText() + usuarioActual.getCasillaDeEntrada().size());
       
        setLocationRelativeTo(null);

    }

    public JPanel getPanelPrincipal() {
        return this.jPanel9;
    }

    public JPanel getPanelHome() {
        return this.panelHome;
    }

    private void actualizarLista() {
        if (listaDiasDeLaSemana.getSelectedItem().equals("lunes")) {
            listaComidasPlan.setListData(usuarioActual.getPlan().getListaLunes().toArray());
        }
        if (listaDiasDeLaSemana.getSelectedItem().equals("martes")) {
            listaComidasPlan.setListData(usuarioActual.getPlan().getListaMartes().toArray());
        }
        if (listaDiasDeLaSemana.getSelectedItem().equals("miercoles")) {
            listaComidasPlan.setListData(usuarioActual.getPlan().getListaMiercoles().toArray());
        }
        if (listaDiasDeLaSemana.getSelectedItem().equals("jueves")) {
            listaComidasPlan.setListData(usuarioActual.getPlan().getListaJueves().toArray());
        }
        if (listaDiasDeLaSemana.getSelectedItem().equals("viernes")) {
            listaComidasPlan.setListData(usuarioActual.getPlan().getListaViernes().toArray());
        }
        if (listaDiasDeLaSemana.getSelectedItem().equals("sabado")) {
            listaComidasPlan.setListData(usuarioActual.getPlan().getListaSabado().toArray());
        }
        if (listaDiasDeLaSemana.getSelectedItem().equals("domingo")) {
            listaComidasPlan.setListData(usuarioActual.getPlan().getListaDomingo().toArray());
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel9 = new javax.swing.JPanel();
        side_pane = new javax.swing.JPanel();
        btn_1 = new javax.swing.JPanel();
        ind_1 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        btn_2 = new javax.swing.JPanel();
        ind_2 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        btn_3 = new javax.swing.JPanel();
        ind_3 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        btn_4 = new javax.swing.JPanel();
        ind_4 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        btn_6 = new javax.swing.JPanel();
        ind_6 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jProgressBar1 = new javax.swing.JProgressBar();
        jLabel5 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        btn_exit = new javax.swing.JLabel();
        etiquetaFoto = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        labelMensajes = new javax.swing.JLabel();
        button1 = new java.awt.Button();
        jLabel16 = new javax.swing.JLabel();
        panelHome = new javax.swing.JPanel();
        btnHistorialDeComidas = new javax.swing.JButton();
        listaDiasDeLaSemana = new javax.swing.JComboBox<>();
        etiquetaComidasDelDia = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaComidasPlan = new javax.swing.JList();
        jLabel6 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setUndecorated(true);
        setType(java.awt.Window.Type.UTILITY);
        getContentPane().setLayout(new java.awt.CardLayout());

        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        side_pane.setBackground(new java.awt.Color(23, 35, 51));
        side_pane.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_1.setBackground(new java.awt.Color(23, 35, 51));
        btn_1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_1MousePressed(evt);
            }
        });

        ind_1.setOpaque(false);
        ind_1.setPreferredSize(new java.awt.Dimension(3, 43));

        javax.swing.GroupLayout ind_1Layout = new javax.swing.GroupLayout(ind_1);
        ind_1.setLayout(ind_1Layout);
        ind_1Layout.setHorizontalGroup(
            ind_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 3, Short.MAX_VALUE)
        );
        ind_1Layout.setVerticalGroup(
            ind_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 43, Short.MAX_VALUE)
        );

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Inicio");

        javax.swing.GroupLayout btn_1Layout = new javax.swing.GroupLayout(btn_1);
        btn_1.setLayout(btn_1Layout);
        btn_1Layout.setHorizontalGroup(
            btn_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_1Layout.createSequentialGroup()
                .addComponent(ind_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE)
                .addContainerGap())
        );
        btn_1Layout.setVerticalGroup(
            btn_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_1Layout.createSequentialGroup()
                .addComponent(ind_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(btn_1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        side_pane.add(btn_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 120, -1));

        btn_2.setBackground(new java.awt.Color(23, 35, 51));
        btn_2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_2MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btn_2MouseReleased(evt);
            }
        });

        ind_2.setOpaque(false);
        ind_2.setPreferredSize(new java.awt.Dimension(3, 43));

        javax.swing.GroupLayout ind_2Layout = new javax.swing.GroupLayout(ind_2);
        ind_2.setLayout(ind_2Layout);
        ind_2Layout.setHorizontalGroup(
            ind_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 3, Short.MAX_VALUE)
        );
        ind_2Layout.setVerticalGroup(
            ind_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 43, Short.MAX_VALUE)
        );

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Solicitar Plan");

        javax.swing.GroupLayout btn_2Layout = new javax.swing.GroupLayout(btn_2);
        btn_2.setLayout(btn_2Layout);
        btn_2Layout.setHorizontalGroup(
            btn_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_2Layout.createSequentialGroup()
                .addComponent(ind_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        btn_2Layout.setVerticalGroup(
            btn_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_2Layout.createSequentialGroup()
                .addComponent(ind_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(btn_2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        side_pane.add(btn_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 120, -1));

        btn_3.setBackground(new java.awt.Color(23, 35, 51));
        btn_3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_3MousePressed(evt);
            }
        });

        ind_3.setOpaque(false);
        ind_3.setPreferredSize(new java.awt.Dimension(3, 43));

        javax.swing.GroupLayout ind_3Layout = new javax.swing.GroupLayout(ind_3);
        ind_3.setLayout(ind_3Layout);
        ind_3Layout.setHorizontalGroup(
            ind_3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 3, Short.MAX_VALUE)
        );
        ind_3Layout.setVerticalGroup(
            ind_3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 43, Short.MAX_VALUE)
        );

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Comida en la Dieta");

        javax.swing.GroupLayout btn_3Layout = new javax.swing.GroupLayout(btn_3);
        btn_3.setLayout(btn_3Layout);
        btn_3Layout.setHorizontalGroup(
            btn_3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_3Layout.createSequentialGroup()
                .addComponent(ind_3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE)
                .addContainerGap())
        );
        btn_3Layout.setVerticalGroup(
            btn_3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_3Layout.createSequentialGroup()
                .addComponent(ind_3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(btn_3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        side_pane.add(btn_3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 120, -1));

        btn_4.setBackground(new java.awt.Color(23, 35, 51));
        btn_4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_4MousePressed(evt);
            }
        });

        ind_4.setOpaque(false);
        ind_4.setPreferredSize(new java.awt.Dimension(3, 43));

        javax.swing.GroupLayout ind_4Layout = new javax.swing.GroupLayout(ind_4);
        ind_4.setLayout(ind_4Layout);
        ind_4Layout.setHorizontalGroup(
            ind_4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 3, Short.MAX_VALUE)
        );
        ind_4Layout.setVerticalGroup(
            ind_4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 43, Short.MAX_VALUE)
        );

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Perfil");

        javax.swing.GroupLayout btn_4Layout = new javax.swing.GroupLayout(btn_4);
        btn_4.setLayout(btn_4Layout);
        btn_4Layout.setHorizontalGroup(
            btn_4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_4Layout.createSequentialGroup()
                .addComponent(ind_4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE)
                .addContainerGap())
        );
        btn_4Layout.setVerticalGroup(
            btn_4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_4Layout.createSequentialGroup()
                .addComponent(ind_4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(btn_4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        side_pane.add(btn_4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 120, -1));

        btn_6.setBackground(new java.awt.Color(23, 35, 51));
        btn_6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_6MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_6MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btn_6MouseReleased(evt);
            }
        });

        ind_6.setOpaque(false);
        ind_6.setPreferredSize(new java.awt.Dimension(3, 43));

        javax.swing.GroupLayout ind_6Layout = new javax.swing.GroupLayout(ind_6);
        ind_6.setLayout(ind_6Layout);
        ind_6Layout.setHorizontalGroup(
            ind_6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 3, Short.MAX_VALUE)
        );
        ind_6Layout.setVerticalGroup(
            ind_6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 43, Short.MAX_VALUE)
        );

        jLabel18.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Realizar Consulta");

        javax.swing.GroupLayout btn_6Layout = new javax.swing.GroupLayout(btn_6);
        btn_6.setLayout(btn_6Layout);
        btn_6Layout.setHorizontalGroup(
            btn_6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_6Layout.createSequentialGroup()
                .addComponent(ind_6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        btn_6Layout.setVerticalGroup(
            btn_6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_6Layout.createSequentialGroup()
                .addComponent(ind_6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(btn_6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        side_pane.add(btn_6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 120, -1));

        jPanel9.add(side_pane, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 120, 590));

        jPanel2.setBackground(new java.awt.Color(71, 120, 197));
        jPanel2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel2MouseDragged(evt);
            }
        });
        jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel2MousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 950, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        jPanel9.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 0, 950, 50));

        jPanel3.setBackground(new java.awt.Color(71, 120, 197));

        jPanel4.setBackground(new java.awt.Color(120, 168, 252));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.setBackground(new java.awt.Color(84, 127, 206));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8_Secured_Letter_25px_2.png"))); // NOI18N
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8_Contacts_25px.png"))); // NOI18N

        jProgressBar1.setBackground(new java.awt.Color(84, 127, 206));
        jProgressBar1.setForeground(new java.awt.Color(0, 204, 204));
        jProgressBar1.setPreferredSize(new java.awt.Dimension(146, 10));
        jProgressBar1.setString("");
        jProgressBar1.setStringPainted(true);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8_Water_25px.png"))); // NOI18N

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8_Lock_25px.png"))); // NOI18N
        jLabel15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel15MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel5)
                .addGap(12, 12, 12)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(40, 40, 40)
                        .addComponent(jLabel15)
                        .addGap(36, 36, 36))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jSeparator1))
                .addGap(40, 40, 40))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 24, Short.MAX_VALUE))
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        jPanel4.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 85, -1, 130));

        btn_exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8_Exit_25px.png"))); // NOI18N
        btn_exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_exitMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_exitMousePressed(evt);
            }
        });
        jPanel4.add(btn_exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(239, 24, -1, 46));

        etiquetaFoto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/profesional.png"))); // NOI18N
        jPanel4.add(etiquetaFoto, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, 0, 130, 90));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Amos");
        jPanel4.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 30, -1, 30));

        labelMensajes.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        labelMensajes.setForeground(new java.awt.Color(255, 255, 255));
        labelMensajes.setText("Mensajes:");

        button1.setBackground(new java.awt.Color(71, 120, 197));
        button1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        button1.setForeground(new java.awt.Color(255, 255, 255));
        button1.setLabel("Casilla de Mensaje");
        button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button1ActionPerformed(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Friday 23 Feb ");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(99, 99, 99))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(labelMensajes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, 19, Short.MAX_VALUE)
                .addGap(38, 38, 38)
                .addComponent(labelMensajes, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(106, Short.MAX_VALUE))
        );

        jPanel9.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 50, 300, 540));

        panelHome.setBackground(new java.awt.Color(255, 255, 255));

        btnHistorialDeComidas.setBackground(new java.awt.Color(71, 120, 197));
        btnHistorialDeComidas.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnHistorialDeComidas.setForeground(new java.awt.Color(255, 255, 255));
        btnHistorialDeComidas.setText("Historial de Comidas");
        btnHistorialDeComidas.setContentAreaFilled(false);
        btnHistorialDeComidas.setOpaque(true);
        btnHistorialDeComidas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHistorialDeComidasActionPerformed(evt);
            }
        });

        listaDiasDeLaSemana.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        listaDiasDeLaSemana.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "lunes", "martes", "miercoles", "jueves", "viernes", "sabado", "domingo" }));
        listaDiasDeLaSemana.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                listaDiasDeLaSemanaItemStateChanged(evt);
            }
        });
        listaDiasDeLaSemana.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listaDiasDeLaSemanaActionPerformed(evt);
            }
        });

        etiquetaComidasDelDia.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        etiquetaComidasDelDia.setText("Comidas del dia:");

        listaComidasPlan.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jScrollPane1.setViewportView(listaComidasPlan);

        jLabel6.setBackground(new java.awt.Color(51, 51, 255));
        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("Plan de Alimentacion:");

        javax.swing.GroupLayout panelHomeLayout = new javax.swing.GroupLayout(panelHome);
        panelHome.setLayout(panelHomeLayout);
        panelHomeLayout.setHorizontalGroup(
            panelHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelHomeLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(panelHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 576, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelHomeLayout.createSequentialGroup()
                        .addComponent(etiquetaComidasDelDia, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(panelHomeLayout.createSequentialGroup()
                                .addComponent(listaDiasDeLaSemana, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnHistorialDeComidas))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(54, Short.MAX_VALUE))
        );
        panelHomeLayout.setVerticalGroup(
            panelHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelHomeLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(panelHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiquetaComidasDelDia)
                    .addComponent(listaDiasDeLaSemana, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnHistorialDeComidas))
                .addGap(33, 33, 33)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
        );

        jPanel9.add(panelHome, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 50, 650, 540));

        getContentPane().add(jPanel9, "card2");
    }// </editor-fold>//GEN-END:initComponents

    private void btn_1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_1MousePressed
        // TODO add your handling code here:
        setColor(btn_1);
        ind_1.setOpaque(true);
        resetColor(new JPanel[]{btn_2, btn_3, btn_4, btn_6}, new JPanel[]{ind_2, ind_3, ind_4, ind_6});
        this.setPanelActual(panelHome);
    }//GEN-LAST:event_btn_1MousePressed

    private void btn_3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_3MousePressed
        // TODO add your handling code here:
        setColor(btn_3);
        ind_3.setOpaque(true);
        resetColor(new JPanel[]{btn_2, btn_1, btn_4, btn_6}, new JPanel[]{ind_2, ind_1, ind_4, ind_6});
        setPanelActual(panelComidaAdieta);
        jPanel9.add(this.getPanelActual(), new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 50, 650, 540));
        jPanel9.setPreferredSize(new Dimension(400, 400));
    }//GEN-LAST:event_btn_3MousePressed

    private void btn_4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_4MousePressed
        // TODO add your handling code here:
        setColor(btn_4);
        ind_4.setOpaque(true);
        resetColor(new JPanel[]{btn_2, btn_3, btn_1, btn_6}, new JPanel[]{ind_2, ind_3, ind_1, ind_6});
        setPanelActual(panelPerfilUsuario);
        jPanel9.add(this.getPanelActual(), new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 50, 650, 540));
        jPanel9.setPreferredSize(new Dimension(400, 400));
    }//GEN-LAST:event_btn_4MousePressed

    private void btn_2MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_2MouseReleased
        // TODO add your handling code here:

    }//GEN-LAST:event_btn_2MouseReleased

    int xx, xy;
    private void jPanel2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MousePressed
        // TODO add your handling code here:
        //drag this pane
        xx = evt.getX();
        xy = evt.getY();
    }//GEN-LAST:event_jPanel2MousePressed

    private void jPanel2MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseDragged
        // TODO add your handling code here:

        //source to drag
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xx, y - xy);
    }//GEN-LAST:event_jPanel2MouseDragged

    private void btn_exitMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_exitMousePressed
        // TODO add your handling code here:
        sistema.guardarSistema();
        System.exit(0);
    }//GEN-LAST:event_btn_exitMousePressed

    private void btn_exitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_exitMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_exitMouseClicked

    private void jLabel15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel15MouseClicked
        InterfazLogin login = new InterfazLogin(ventana, sistema);
        login.setVisible(true);
        hide();        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel15MouseClicked

    private void btn_6MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_6MouseReleased

    }//GEN-LAST:event_btn_6MouseReleased

    private void btn_6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_6MouseClicked

    }//GEN-LAST:event_btn_6MouseClicked

    private void btn_6MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_6MousePressed
        setColor(btn_6);
        ind_6.setOpaque(true);
        setPanelActual(panelConsulta);
        jPanel9.add(this.getPanelActual(), new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 50, 650, 540));
        jPanel9.setPreferredSize(new Dimension(400, 400));
        resetColor(new JPanel[]{btn_2, btn_3, btn_1, btn_4}, new JPanel[]{ind_2, ind_3, ind_1, ind_4});
    }//GEN-LAST:event_btn_6MousePressed

    private void btn_2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_2MousePressed
        setColor(btn_2);
        ind_2.setOpaque(true);

        setPanelActual(panelPlanAlimentacionUsuario);
        jPanel9.add(this.getPanelActual(), new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 50, 650, 540));
        jPanel9.setPreferredSize(new Dimension(400, 400));
        resetColor(new JPanel[]{btn_6, btn_3, btn_1, btn_4}, new JPanel[]{ind_6, ind_3, ind_1, ind_4});
    }//GEN-LAST:event_btn_2MousePressed

    private void button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button1ActionPerformed
        setPanelActual(buzon);
        jPanel9.add(this.getPanelActual(), new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 50, 650, 540));
        jPanel9.setPreferredSize(new Dimension(400, 400));
    }//GEN-LAST:event_button1ActionPerformed

    private void btnHistorialDeComidasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHistorialDeComidasActionPerformed

        PanelHistorialDeComidasUsuario nuevoPanel = new PanelHistorialDeComidasUsuario(sistema, this, usuarioActual);
        setPanelActual(nuevoPanel);
        jPanel9.add(this.getPanelActual(), new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 50, 650, 540));
        jPanel9.setPreferredSize(new Dimension(400, 400));

    }//GEN-LAST:event_btnHistorialDeComidasActionPerformed

    private void listaDiasDeLaSemanaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_listaDiasDeLaSemanaItemStateChanged
        if (usuarioActual.getPlan() != null) {
            actualizarLista();
        }
    }//GEN-LAST:event_listaDiasDeLaSemanaItemStateChanged

    private void listaDiasDeLaSemanaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listaDiasDeLaSemanaActionPerformed
       actualizarLista();
    }//GEN-LAST:event_listaDiasDeLaSemanaActionPerformed

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
      setPanelActual(buzon);
        jPanel9.add(this.getPanelActual(), new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 50, 650, 540));
        jPanel9.setPreferredSize(new Dimension(400, 400));
    }//GEN-LAST:event_jLabel1MouseClicked
    
    
    
    
    
    
    
    public void setPanelActual(JPanel unPanelActual) {
        this.getPanelActual().hide();
        this.panelActual = unPanelActual;
        this.getPanelActual().show();
    }

    public JPanel getPanelActual() {

        return this.panelActual;
    }

    /**
     * @param args the command line arguments
     */
    private void setColor(JPanel pane) {
        pane.setBackground(new Color(41, 57, 80));
    }

    private void resetColor(JPanel[] pane, JPanel[] indicators) {
        for (JPanel pane1 : pane) {
            pane1.setBackground(new Color(23, 35, 51));
        }
        for (JPanel indicator : indicators) {
            indicator.setOpaque(false);
        }

    }

    private void formWindowClosing(java.awt.event.WindowEvent evt) {
        sistema.guardarSistema();
    }

    private void formWindowClosed(java.awt.event.WindowEvent evt) {
        sistema.guardarSistema();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHistorialDeComidas;
    private javax.swing.JPanel btn_1;
    private javax.swing.JPanel btn_2;
    private javax.swing.JPanel btn_3;
    private javax.swing.JPanel btn_4;
    private javax.swing.JPanel btn_6;
    private javax.swing.JLabel btn_exit;
    private java.awt.Button button1;
    private javax.swing.JLabel etiquetaComidasDelDia;
    private javax.swing.JLabel etiquetaFoto;
    private javax.swing.JPanel ind_1;
    private javax.swing.JPanel ind_2;
    private javax.swing.JPanel ind_3;
    private javax.swing.JPanel ind_4;
    private javax.swing.JPanel ind_6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel labelMensajes;
    private javax.swing.JList listaComidasPlan;
    private javax.swing.JComboBox<String> listaDiasDeLaSemana;
    private javax.swing.JPanel panelHome;
    private javax.swing.JPanel side_pane;
    // End of variables declaration//GEN-END:variables
}
