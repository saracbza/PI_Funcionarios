/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package telas;

import banco.FuncionarioDAO;
import banco.PagamentoDAO;
import entidades.Funcionario;
import entidades.Pagamento;
import funcoes.Calculos;
import java.awt.Color;
import java.util.Date;
import java.util.List;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Abner
 */
public class TelaHolerite extends javax.swing.JFrame {

    public int codFunc;
    public int codPagamento;
    int acesso;

    /**
     * Creates new form TelaHolerite
     */
    public TelaHolerite() {
        initComponents();
    }
    
    public TelaHolerite(int acesso) {
        initComponents();
        this.acesso = acesso;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnl_backgroundHol = new javax.swing.JPanel();
        jlb_visualizarHol = new javax.swing.JLabel();
        jlb_cadastrarHol = new javax.swing.JLabel();
        pnl_defaultHol = new javax.swing.JPanel();
        pnl_visualizarHol = new javax.swing.JPanel();
        jtf_Filtro = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbl_pagamentos = new javax.swing.JTable();
        btn_gerarHol = new javax.swing.JButton();
        btn_Excluir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        pnl_cadastrarHol = new javax.swing.JPanel();
        jtf_trabalhadasHol = new javax.swing.JTextField();
        jtf_extrasHol = new javax.swing.JTextField();
        jtf_domingosHol = new javax.swing.JTextField();
        jcb_funcionarioHol = new javax.swing.JComboBox();
        jlb_funcionarioHol = new javax.swing.JLabel();
        btn_cancelarHol = new javax.swing.JButton();
        btn_salvarHol = new javax.swing.JButton();
        jlb_horasHol = new javax.swing.JLabel();
        jlb_voltar4 = new javax.swing.JLabel();
        jlb_image42 = new javax.swing.JLabel();
        jlb_image4 = new javax.swing.JLabel();
        jlb_branco4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        pnl_backgroundHol.setBackground(new java.awt.Color(181, 210, 255));
        pnl_backgroundHol.setLayout(null);

        jlb_visualizarHol.setBackground(new java.awt.Color(181, 210, 255));
        jlb_visualizarHol.setFont(new java.awt.Font("SansSerif", 3, 18)); // NOI18N
        jlb_visualizarHol.setForeground(new java.awt.Color(25, 39, 70));
        jlb_visualizarHol.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlb_visualizarHol.setText("VISUALIZAR HOLERITE");
        jlb_visualizarHol.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jlb_visualizarHol.setOpaque(true);
        jlb_visualizarHol.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlb_visualizarHolMouseClicked(evt);
            }
        });
        pnl_backgroundHol.add(jlb_visualizarHol);
        jlb_visualizarHol.setBounds(390, 0, 380, 60);

        jlb_cadastrarHol.setBackground(new java.awt.Color(181, 210, 255));
        jlb_cadastrarHol.setFont(new java.awt.Font("SansSerif", 3, 18)); // NOI18N
        jlb_cadastrarHol.setForeground(new java.awt.Color(25, 39, 70));
        jlb_cadastrarHol.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlb_cadastrarHol.setText("CADASTRAR HOLERITE");
        jlb_cadastrarHol.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jlb_cadastrarHol.setOpaque(true);
        jlb_cadastrarHol.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlb_cadastrarHolMouseClicked(evt);
            }
        });
        pnl_backgroundHol.add(jlb_cadastrarHol);
        jlb_cadastrarHol.setBounds(0, 0, 380, 60);

        pnl_defaultHol.setBackground(new java.awt.Color(255, 255, 255));
        pnl_defaultHol.setAutoscrolls(true);
        pnl_backgroundHol.add(pnl_defaultHol);
        pnl_defaultHol.setBounds(0, 0, 770, 570);

        pnl_visualizarHol.setBackground(new java.awt.Color(181, 210, 255));
        pnl_visualizarHol.setMinimumSize(new java.awt.Dimension(770, 510));
        pnl_visualizarHol.setLayout(null);

        jtf_Filtro.setBackground(new java.awt.Color(181, 210, 255));
        jtf_Filtro.setFont(new java.awt.Font("SansSerif", 3, 16)); // NOI18N
        jtf_Filtro.setBorder(null);
        jtf_Filtro.setEnabled(false);
        jtf_Filtro.setMaximumSize(new java.awt.Dimension(63, 25));
        jtf_Filtro.setMinimumSize(new java.awt.Dimension(63, 25));
        jtf_Filtro.setPreferredSize(new java.awt.Dimension(63, 25));
        jtf_Filtro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtf_FiltroKeyReleased(evt);
            }
        });
        pnl_visualizarHol.add(jtf_Filtro);
        jtf_Filtro.setBounds(150, 56, 490, 25);

        tbl_pagamentos.setBackground(new java.awt.Color(86, 153, 220));
        tbl_pagamentos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        tbl_pagamentos.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        tbl_pagamentos.setForeground(new java.awt.Color(255, 255, 255));
        tbl_pagamentos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Código", "Funcionário", "Cargo", "Data do pagamento"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbl_pagamentos.setMaximumSize(new java.awt.Dimension(215, 104));
        tbl_pagamentos.setRowHeight(26);
        tbl_pagamentos.setSelectionBackground(new java.awt.Color(255, 255, 255));
        tbl_pagamentos.setSelectionForeground(new java.awt.Color(0, 10, 125));
        tbl_pagamentos.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tbl_pagamentos.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tbl_pagamentos.setShowGrid(true);
        tbl_pagamentos.setShowVerticalLines(false);
        tbl_pagamentos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_pagamentosMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tbl_pagamentos);

        pnl_visualizarHol.add(jScrollPane2);
        jScrollPane2.setBounds(0, 100, 770, 160);

        btn_gerarHol.setBackground(new java.awt.Color(91, 225, 64));
        btn_gerarHol.setFont(new java.awt.Font("SansSerif", 3, 25)); // NOI18N
        btn_gerarHol.setForeground(new java.awt.Color(255, 255, 255));
        btn_gerarHol.setText("Gerar");
        btn_gerarHol.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_gerarHol.setFocusPainted(false);
        btn_gerarHol.setFocusable(false);
        btn_gerarHol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_gerarHolActionPerformed(evt);
            }
        });
        pnl_visualizarHol.add(btn_gerarHol);
        btn_gerarHol.setBounds(400, 430, 150, 50);

        btn_Excluir.setBackground(new java.awt.Color(199, 52, 86));
        btn_Excluir.setFont(new java.awt.Font("SansSerif", 3, 25)); // NOI18N
        btn_Excluir.setForeground(new java.awt.Color(255, 255, 255));
        btn_Excluir.setText("Excluir");
        btn_Excluir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_Excluir.setFocusPainted(false);
        btn_Excluir.setFocusable(false);
        btn_Excluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ExcluirActionPerformed(evt);
            }
        });
        pnl_visualizarHol.add(btn_Excluir);
        btn_Excluir.setBounds(565, 430, 150, 50);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/LBL_ProcurarNome.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        pnl_visualizarHol.add(jLabel1);
        jLabel1.setBounds(130, 10, 520, 90);

        pnl_backgroundHol.add(pnl_visualizarHol);
        pnl_visualizarHol.setBounds(0, 60, 770, 510);

        pnl_cadastrarHol.setBackground(new java.awt.Color(181, 210, 255));
        pnl_cadastrarHol.setLayout(null);

        jtf_trabalhadasHol.setBackground(new java.awt.Color(181, 210, 255));
        jtf_trabalhadasHol.setFont(new java.awt.Font("SansSerif", 3, 17)); // NOI18N
        jtf_trabalhadasHol.setActionCommand("<Not Set>");
        jtf_trabalhadasHol.setAutoscrolls(false);
        jtf_trabalhadasHol.setBorder(null);
        jtf_trabalhadasHol.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jtf_trabalhadasHol.setEnabled(false);
        jtf_trabalhadasHol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtf_trabalhadasHolActionPerformed(evt);
            }
        });
        pnl_cadastrarHol.add(jtf_trabalhadasHol);
        jtf_trabalhadasHol.setBounds(70, 266, 300, 40);

        jtf_extrasHol.setBackground(new java.awt.Color(181, 210, 255));
        jtf_extrasHol.setFont(new java.awt.Font("SansSerif", 3, 17)); // NOI18N
        jtf_extrasHol.setActionCommand("<Not Set>");
        jtf_extrasHol.setAutoscrolls(false);
        jtf_extrasHol.setBorder(null);
        jtf_extrasHol.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jtf_extrasHol.setEnabled(false);
        pnl_cadastrarHol.add(jtf_extrasHol);
        jtf_extrasHol.setBounds(415, 266, 300, 40);

        jtf_domingosHol.setBackground(new java.awt.Color(181, 210, 255));
        jtf_domingosHol.setFont(new java.awt.Font("SansSerif", 3, 17)); // NOI18N
        jtf_domingosHol.setActionCommand("<Not Set>");
        jtf_domingosHol.setAutoscrolls(false);
        jtf_domingosHol.setBorder(null);
        jtf_domingosHol.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jtf_domingosHol.setEnabled(false);
        pnl_cadastrarHol.add(jtf_domingosHol);
        jtf_domingosHol.setBounds(70, 360, 300, 40);

        jcb_funcionarioHol.setBackground(new java.awt.Color(86, 153, 255));
        jcb_funcionarioHol.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jcb_funcionarioHol.setForeground(new java.awt.Color(255, 255, 255));
        jcb_funcionarioHol.setToolTipText("");
        jcb_funcionarioHol.setAlignmentX(1.0F);
        jcb_funcionarioHol.setBorder(null);
        jcb_funcionarioHol.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jcb_funcionarioHol.setFocusable(false);
        jcb_funcionarioHol.setRequestFocusEnabled(false);
        jcb_funcionarioHol.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jcb_funcionarioHolAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jcb_funcionarioHol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcb_funcionarioHolActionPerformed(evt);
            }
        });
        pnl_cadastrarHol.add(jcb_funcionarioHol);
        jcb_funcionarioHol.setBounds(37, 85, 705, 45);

        jlb_funcionarioHol.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/LBL_Funcionário.png"))); // NOI18N
        pnl_cadastrarHol.add(jlb_funcionarioHol);
        jlb_funcionarioHol.setBounds(30, 30, 720, 110);

        btn_cancelarHol.setBackground(new java.awt.Color(242, 172, 52));
        btn_cancelarHol.setFont(new java.awt.Font("SansSerif", 1, 25)); // NOI18N
        btn_cancelarHol.setText("Cancelar");
        btn_cancelarHol.setFocusPainted(false);
        btn_cancelarHol.setFocusable(false);
        btn_cancelarHol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelarHolActionPerformed(evt);
            }
        });
        pnl_cadastrarHol.add(btn_cancelarHol);
        btn_cancelarHol.setBounds(410, 420, 150, 50);

        btn_salvarHol.setBackground(new java.awt.Color(91, 225, 64));
        btn_salvarHol.setFont(new java.awt.Font("SansSerif", 3, 25)); // NOI18N
        btn_salvarHol.setForeground(new java.awt.Color(255, 255, 255));
        btn_salvarHol.setText("Salvar");
        btn_salvarHol.setFocusPainted(false);
        btn_salvarHol.setFocusable(false);
        btn_salvarHol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_salvarHolActionPerformed(evt);
            }
        });
        pnl_cadastrarHol.add(btn_salvarHol);
        btn_salvarHol.setBounds(590, 420, 150, 50);

        jlb_horasHol.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/LBL_Horas.png"))); // NOI18N
        jlb_horasHol.setText("jLabel1");
        pnl_cadastrarHol.add(jlb_horasHol);
        jlb_horasHol.setBounds(30, 160, 720, 250);

        pnl_backgroundHol.add(pnl_cadastrarHol);
        pnl_cadastrarHol.setBounds(0, 60, 770, 510);

        getContentPane().add(pnl_backgroundHol);
        pnl_backgroundHol.setBounds(440, 180, 770, 570);

        jlb_voltar4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/BTN_voltar.png"))); // NOI18N
        jlb_voltar4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jlb_voltar4.setOpaque(true);
        jlb_voltar4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlb_voltar4MouseClicked(evt);
            }
        });
        getContentPane().add(jlb_voltar4);
        jlb_voltar4.setBounds(440, 55, 100, 90);

        jlb_image42.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/LBL_Holerite.png"))); // NOI18N
        getContentPane().add(jlb_image42);
        jlb_image42.setBounds(545, 50, 590, 100);

        jlb_image4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/SFP_Principal.png"))); // NOI18N
        getContentPane().add(jlb_image4);
        jlb_image4.setBounds(0, 0, 425, 780);

        jlb_branco4.setBackground(new java.awt.Color(255, 255, 255));
        jlb_branco4.setOpaque(true);
        getContentPane().add(jlb_branco4);
        jlb_branco4.setBounds(0, 0, 1250, 780);

        setSize(new java.awt.Dimension(1266, 788));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jlb_visualizarHolMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlb_visualizarHolMouseClicked
        pnl_defaultHol.setVisible(false);
        pnl_cadastrarHol.setVisible(false);
        pnl_visualizarHol.setVisible(true);
        jlb_cadastrarHol.setBackground(new Color(181,210,255));
        jlb_cadastrarHol.setForeground(new Color(25,39,70));
        jlb_visualizarHol.setBackground(new Color(25,39,70));
        jlb_visualizarHol.setForeground(Color.white);
        jtf_Filtro.setEnabled(true);
        jtf_Filtro.setText("");
        preencherTab();
    }//GEN-LAST:event_jlb_visualizarHolMouseClicked

    private void jlb_cadastrarHolMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlb_cadastrarHolMouseClicked
        pnl_defaultHol.setVisible(false);
        pnl_cadastrarHol.setVisible(true);
        pnl_visualizarHol.setVisible(false);
        jlb_funcionarioHol.setEnabled(true);
        jtf_domingosHol.setEnabled(true);
        jtf_extrasHol.setEnabled(true);
        jtf_trabalhadasHol.setEnabled(true);
        jlb_cadastrarHol.setBackground(new Color(25,39,70));
        jlb_cadastrarHol.setForeground(Color.white);
        jlb_visualizarHol.setBackground(new Color(181,210,255));
        jlb_visualizarHol.setForeground(new Color(25,39,70));    
    }//GEN-LAST:event_jlb_cadastrarHolMouseClicked

    private void jcb_funcionarioHolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcb_funcionarioHolActionPerformed
        Vector<Integer> codigos = new Vector<Integer>();     
        int posicaoFunc = jcb_funcionarioHol.getSelectedIndex();
        FuncionarioDAO f = new FuncionarioDAO();
        codigos = f.listarCod("SELECT cod_func FROM funcionario ORDER BY cod_func");
        codFunc = codigos.get(posicaoFunc);
    }//GEN-LAST:event_jcb_funcionarioHolActionPerformed

    private void btn_cancelarHolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelarHolActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_cancelarHolActionPerformed

    private void btn_salvarHolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salvarHolActionPerformed
        //salvar calculos no banco
        	float valor_hr, porcentagem_rec, salario_base, irrf, inss, fgts, salario_liq;
		int dependentes;
		String sen, cargo;
		//recebe dados para calculo de pagamento
	
		float horasTrabalhadas = Float.parseFloat(jtf_trabalhadasHol.getText());
		float horasExtras = Float.parseFloat(jtf_extrasHol.getText());
		
		FuncionarioDAO func = new FuncionarioDAO();
		
		//busca restante dos dados necessarios no banco
		func.listarDados(codFunc);
		valor_hr = func.valor_hr;
		porcentagem_rec = func.porcentagem_rec;
		dependentes = func.dependentes;
		
		//executar calculos		
		salario_base = Calculos.salario_bruto(valor_hr, porcentagem_rec, horasTrabalhadas, horasExtras);
		inss = Calculos.inss(salario_base);
		irrf = Calculos.irrf(salario_base - inss, dependentes);
		fgts = Calculos.fgts(salario_base);
		salario_liq = Calculos.calculo_pagamento(salario_base, inss, irrf);
		
		//buscar cargo e senioridade
		func.listarFuncionario(codFunc);
		sen = func.sen;
		cargo = func.cargo;
		cargo = cargo + " " + sen;
		Date d = new Date();
		//cria objeto pagamento
		Pagamento pagamento = new Pagamento(codFunc, cargo, salario_liq, inss, irrf, fgts, d);
		PagamentoDAO dao = new PagamentoDAO();
		JOptionPane.showMessageDialog(null,dao.salvar(pagamento));
                
                //limpar caixas
                jtf_trabalhadasHol.setText("");
                jtf_extrasHol.setText("");
                jtf_domingosHol.setText(""); 
                jcb_funcionarioHol.setSelectedIndex(0);
    }//GEN-LAST:event_btn_salvarHolActionPerformed

    
    private void jlb_voltar4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlb_voltar4MouseClicked
        TelaPrincipal principal = new TelaPrincipal(acesso);
        principal.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jlb_voltar4MouseClicked

    private void jcb_funcionarioHolAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jcb_funcionarioHolAncestorAdded
        preencherList();
    }//GEN-LAST:event_jcb_funcionarioHolAncestorAdded

    private void jtf_trabalhadasHolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtf_trabalhadasHolActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtf_trabalhadasHolActionPerformed

    private void jtf_FiltroKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtf_FiltroKeyReleased
        preencherTab();
    }//GEN-LAST:event_jtf_FiltroKeyReleased

    private void btn_gerarHolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_gerarHolActionPerformed
        Holerite holerite = new Holerite(acesso);
        holerite.setVisible(true);
        holerite.pagamento(codPagamento);
        this.dispose();
    }//GEN-LAST:event_btn_gerarHolActionPerformed

    private void tbl_pagamentosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_pagamentosMouseClicked
       if (tbl_pagamentos.getSelectedRow() != -1){
        codPagamento = Integer.parseInt(tbl_pagamentos.getValueAt(tbl_pagamentos.getSelectedRow(), 0).toString());
} 
    }//GEN-LAST:event_tbl_pagamentosMouseClicked

    private void btn_ExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ExcluirActionPerformed
       PagamentoDAO dao = new PagamentoDAO();
       JOptionPane.showMessageDialog(null, dao.excluir(codPagamento));
       
       preencherTab();
    }//GEN-LAST:event_btn_ExcluirActionPerformed

    /**
     * Busca os dados no banco para preenchimento de lista
     */
    private void preencherList()
    {
        FuncionarioDAO func = new FuncionarioDAO();
        List<Funcionario> listaFunc = func.listarNome("SELECT nome FROM funcionario ORDER BY cod_func");
        
        jcb_funcionarioHol.removeAll();
        
        for (Funcionario f : listaFunc)
        {
            jcb_funcionarioHol.addItem(f);
        }
    }
    
    /**
     * Busca os dados no banco para preenchimento de tabela
     */
    private void preencherTab()
    {
        PagamentoDAO pag = new PagamentoDAO();
        String nomeFunc = jtf_Filtro.getText();
        List<Pagamento> listaPagamentos = pag.pagamentos(nomeFunc);
        
        DefaultTableModel tabelaPagamentos = (DefaultTableModel) tbl_pagamentos.getModel();
        
        tabelaPagamentos.setNumRows(0);
        for (Pagamento p : listaPagamentos)
        {
            Object[] obj = new Object[]{
            
            p.getCodigo(), p.getNomeFunc(), p.getCargo_senioridade(), p.getData_pagamento()};
            
            tabelaPagamentos.addRow(obj);
        }
    }
   
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
            java.util.logging.Logger.getLogger(TelaHolerite.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaHolerite.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaHolerite.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaHolerite.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaHolerite().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Excluir;
    private javax.swing.JButton btn_cancelarHol;
    private javax.swing.JButton btn_gerarHol;
    private javax.swing.JButton btn_salvarHol;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JComboBox jcb_funcionarioHol;
    private javax.swing.JLabel jlb_branco4;
    private javax.swing.JLabel jlb_cadastrarHol;
    private javax.swing.JLabel jlb_funcionarioHol;
    private javax.swing.JLabel jlb_horasHol;
    private javax.swing.JLabel jlb_image4;
    private javax.swing.JLabel jlb_image42;
    private javax.swing.JLabel jlb_visualizarHol;
    private javax.swing.JLabel jlb_voltar4;
    private javax.swing.JTextField jtf_Filtro;
    private javax.swing.JTextField jtf_domingosHol;
    private javax.swing.JTextField jtf_extrasHol;
    private javax.swing.JTextField jtf_trabalhadasHol;
    private javax.swing.JPanel pnl_backgroundHol;
    private javax.swing.JPanel pnl_cadastrarHol;
    private javax.swing.JPanel pnl_defaultHol;
    private javax.swing.JPanel pnl_visualizarHol;
    private javax.swing.JTable tbl_pagamentos;
    // End of variables declaration//GEN-END:variables
}
