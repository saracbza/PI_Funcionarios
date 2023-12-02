/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package telas;

import banco.PagamentoDAO;
import entidades.Pagamento;
import java.text.DecimalFormat;

/**
 *
 * @author Abner
 */
public class Holerite extends javax.swing.JFrame{

    int codPagamento, acesso;
    /**
     * Creates new form TelaHolerite
     */
    public Holerite() {
        initComponents();
    }
    public Holerite(int acesso) {
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

        pnl_assin = new javax.swing.JPanel();
        btn_voltar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        pnl_dadosEmpresa = new javax.swing.JPanel();
        jlb_nomeEmpresa = new javax.swing.JLabel();
        jlb_endEmpresa = new javax.swing.JLabel();
        jlb_cnpjEmpresa = new javax.swing.JLabel();
        jlb_tituloRecibo = new javax.swing.JLabel();
        jlb_dataDoPagamento = new javax.swing.JLabel();
        jlb_data = new javax.swing.JLabel();
        jlb_empregador = new javax.swing.JLabel();
        pnl_dadosFunc = new javax.swing.JPanel();
        jlb_nomeDoFuncionario = new javax.swing.JLabel();
        jlb_nome = new javax.swing.JLabel();
        jlb_funcao = new javax.swing.JLabel();
        jlb_cargo = new javax.swing.JLabel();
        pnl_dadosPagamento = new javax.swing.JPanel();
        jsp_desc = new javax.swing.JSeparator();
        jlb_tituloDesc = new javax.swing.JLabel();
        jlb_tituloDescontos = new javax.swing.JLabel();
        jlb_tituloProventos = new javax.swing.JLabel();
        jlb_salarioBase = new javax.swing.JLabel();
        jlb_INSS = new javax.swing.JLabel();
        jlb_IRRF = new javax.swing.JLabel();
        jlb_inss = new javax.swing.JLabel();
        jlb_salario = new javax.swing.JLabel();
        jlb_irrf = new javax.swing.JLabel();
        pnl_total = new javax.swing.JPanel();
        jlb_totalDescontos = new javax.swing.JLabel();
        jlb_totalDesc = new javax.swing.JLabel();
        jlb_liqAReceber = new javax.swing.JLabel();
        jlb_totalLiquido = new javax.swing.JLabel();
        jlb_FGTS = new javax.swing.JLabel();
        jlb_fgts = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);

        pnl_assin.setBackground(new java.awt.Color(255, 255, 255));
        pnl_assin.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pnl_assin.setLayout(null);

        btn_voltar.setText("Voltar");
        btn_voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_voltarActionPerformed(evt);
            }
        });
        pnl_assin.add(btn_voltar);
        btn_voltar.setBounds(30, 20, 72, 23);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/LBL_Assinatura.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        pnl_assin.add(jLabel1);
        jLabel1.setBounds(10, 540, 107, 100);

        pnl_dadosEmpresa.setBackground(new java.awt.Color(255, 255, 255));
        pnl_dadosEmpresa.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jlb_nomeEmpresa.setBackground(new java.awt.Color(0, 0, 0));
        jlb_nomeEmpresa.setFont(new java.awt.Font("MS PGothic", 0, 18)); // NOI18N
        jlb_nomeEmpresa.setText("Nome Ficticio LTDA");

        jlb_endEmpresa.setBackground(new java.awt.Color(0, 0, 0));
        jlb_endEmpresa.setFont(new java.awt.Font("MS PGothic", 0, 18)); // NOI18N
        jlb_endEmpresa.setText("Rua Osmar Mytex, 123 - Jd. Flores Lindas");

        jlb_cnpjEmpresa.setBackground(new java.awt.Color(0, 0, 0));
        jlb_cnpjEmpresa.setFont(new java.awt.Font("MS PGothic", 0, 18)); // NOI18N
        jlb_cnpjEmpresa.setText("CNPJ: 12.345.678/0009-10");

        jlb_tituloRecibo.setBackground(new java.awt.Color(0, 0, 0));
        jlb_tituloRecibo.setFont(new java.awt.Font("MS PGothic", 1, 21)); // NOI18N
        jlb_tituloRecibo.setText("Recibo de Pagamento de Salário");

        jlb_dataDoPagamento.setBackground(new java.awt.Color(0, 0, 0));
        jlb_dataDoPagamento.setFont(new java.awt.Font("MS PGothic", 0, 18)); // NOI18N
        jlb_dataDoPagamento.setText("Data do pagamento");

        jlb_data.setBackground(new java.awt.Color(0, 0, 0));
        jlb_data.setFont(new java.awt.Font("MS PGothic", 0, 18)); // NOI18N
        jlb_data.setText("data");

        jlb_empregador.setBackground(new java.awt.Color(0, 0, 0));
        jlb_empregador.setFont(new java.awt.Font("MS PGothic", 0, 18)); // NOI18N
        jlb_empregador.setText("Empregador");

        javax.swing.GroupLayout pnl_dadosEmpresaLayout = new javax.swing.GroupLayout(pnl_dadosEmpresa);
        pnl_dadosEmpresa.setLayout(pnl_dadosEmpresaLayout);
        pnl_dadosEmpresaLayout.setHorizontalGroup(
            pnl_dadosEmpresaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_dadosEmpresaLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(pnl_dadosEmpresaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_dadosEmpresaLayout.createSequentialGroup()
                        .addComponent(jlb_empregador)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jlb_tituloRecibo))
                    .addGroup(pnl_dadosEmpresaLayout.createSequentialGroup()
                        .addComponent(jlb_nomeEmpresa)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jlb_dataDoPagamento))
                    .addGroup(pnl_dadosEmpresaLayout.createSequentialGroup()
                        .addComponent(jlb_cnpjEmpresa)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(pnl_dadosEmpresaLayout.createSequentialGroup()
                        .addComponent(jlb_endEmpresa)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jlb_data, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        pnl_dadosEmpresaLayout.setVerticalGroup(
            pnl_dadosEmpresaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_dadosEmpresaLayout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(pnl_dadosEmpresaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlb_tituloRecibo)
                    .addComponent(jlb_empregador))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnl_dadosEmpresaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlb_dataDoPagamento)
                    .addComponent(jlb_nomeEmpresa))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnl_dadosEmpresaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlb_endEmpresa)
                    .addComponent(jlb_data))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlb_cnpjEmpresa)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        pnl_dadosFunc.setBackground(new java.awt.Color(255, 255, 255));
        pnl_dadosFunc.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jlb_nomeDoFuncionario.setBackground(new java.awt.Color(0, 0, 0));
        jlb_nomeDoFuncionario.setFont(new java.awt.Font("MS PGothic", 0, 18)); // NOI18N
        jlb_nomeDoFuncionario.setText("Nome do funcionário");

        jlb_nome.setBackground(new java.awt.Color(0, 0, 0));
        jlb_nome.setFont(new java.awt.Font("MS PGothic", 0, 18)); // NOI18N
        jlb_nome.setText("nome");

        jlb_funcao.setBackground(new java.awt.Color(0, 0, 0));
        jlb_funcao.setFont(new java.awt.Font("MS PGothic", 0, 18)); // NOI18N
        jlb_funcao.setText("Função");

        jlb_cargo.setBackground(new java.awt.Color(0, 0, 0));
        jlb_cargo.setFont(new java.awt.Font("MS PGothic", 0, 18)); // NOI18N
        jlb_cargo.setText("cargo");

        javax.swing.GroupLayout pnl_dadosFuncLayout = new javax.swing.GroupLayout(pnl_dadosFunc);
        pnl_dadosFunc.setLayout(pnl_dadosFuncLayout);
        pnl_dadosFuncLayout.setHorizontalGroup(
            pnl_dadosFuncLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_dadosFuncLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(pnl_dadosFuncLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlb_nomeDoFuncionario)
                    .addComponent(jlb_nome, javax.swing.GroupLayout.PREFERRED_SIZE, 417, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 276, Short.MAX_VALUE)
                .addGroup(pnl_dadosFuncLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlb_funcao)
                    .addComponent(jlb_cargo, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19))
        );
        pnl_dadosFuncLayout.setVerticalGroup(
            pnl_dadosFuncLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_dadosFuncLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(pnl_dadosFuncLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlb_nomeDoFuncionario)
                    .addComponent(jlb_funcao))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnl_dadosFuncLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlb_nome)
                    .addComponent(jlb_cargo))
                .addContainerGap(39, Short.MAX_VALUE))
        );

        pnl_dadosPagamento.setBackground(new java.awt.Color(255, 255, 255));
        pnl_dadosPagamento.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jsp_desc.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jlb_tituloDesc.setBackground(new java.awt.Color(0, 0, 0));
        jlb_tituloDesc.setFont(new java.awt.Font("MS PGothic", 1, 21)); // NOI18N
        jlb_tituloDesc.setText("Descrição");

        jlb_tituloDescontos.setBackground(new java.awt.Color(0, 0, 0));
        jlb_tituloDescontos.setFont(new java.awt.Font("MS PGothic", 1, 21)); // NOI18N
        jlb_tituloDescontos.setText("Descontos");

        jlb_tituloProventos.setBackground(new java.awt.Color(0, 0, 0));
        jlb_tituloProventos.setFont(new java.awt.Font("MS PGothic", 1, 21)); // NOI18N
        jlb_tituloProventos.setText("Proventos");

        jlb_salarioBase.setBackground(new java.awt.Color(0, 0, 0));
        jlb_salarioBase.setFont(new java.awt.Font("MS PGothic", 0, 18)); // NOI18N
        jlb_salarioBase.setText("SALARIO BASE");

        jlb_INSS.setBackground(new java.awt.Color(0, 0, 0));
        jlb_INSS.setFont(new java.awt.Font("MS PGothic", 0, 18)); // NOI18N
        jlb_INSS.setText("INSS");

        jlb_IRRF.setBackground(new java.awt.Color(0, 0, 0));
        jlb_IRRF.setFont(new java.awt.Font("MS PGothic", 0, 18)); // NOI18N
        jlb_IRRF.setText("IRRF");

        jlb_inss.setBackground(new java.awt.Color(0, 0, 0));
        jlb_inss.setFont(new java.awt.Font("MS PGothic", 0, 18)); // NOI18N
        jlb_inss.setText("inss");

        jlb_salario.setBackground(new java.awt.Color(0, 0, 0));
        jlb_salario.setFont(new java.awt.Font("MS PGothic", 0, 18)); // NOI18N
        jlb_salario.setText("salario");

        jlb_irrf.setBackground(new java.awt.Color(0, 0, 0));
        jlb_irrf.setFont(new java.awt.Font("MS PGothic", 0, 18)); // NOI18N
        jlb_irrf.setText("irrf");

        javax.swing.GroupLayout pnl_dadosPagamentoLayout = new javax.swing.GroupLayout(pnl_dadosPagamento);
        pnl_dadosPagamento.setLayout(pnl_dadosPagamentoLayout);
        pnl_dadosPagamentoLayout.setHorizontalGroup(
            pnl_dadosPagamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_dadosPagamentoLayout.createSequentialGroup()
                .addContainerGap(314, Short.MAX_VALUE)
                .addComponent(jlb_tituloDesc)
                .addGap(333, 333, 333)
                .addComponent(jlb_tituloProventos)
                .addGap(108, 108, 108)
                .addComponent(jlb_tituloDescontos)
                .addGap(46, 46, 46))
            .addGroup(pnl_dadosPagamentoLayout.createSequentialGroup()
                .addGap(95, 95, 95)
                .addGroup(pnl_dadosPagamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnl_dadosPagamentoLayout.createSequentialGroup()
                        .addComponent(jlb_IRRF)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jlb_irrf, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnl_dadosPagamentoLayout.createSequentialGroup()
                        .addComponent(jlb_salarioBase)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jlb_salario, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(159, 159, 159))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnl_dadosPagamentoLayout.createSequentialGroup()
                        .addComponent(jlb_INSS)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jlb_inss, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))))
            .addGroup(pnl_dadosPagamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnl_dadosPagamentoLayout.createSequentialGroup()
                    .addGap(85, 85, 85)
                    .addComponent(jsp_desc, javax.swing.GroupLayout.PREFERRED_SIZE, 619, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(407, Short.MAX_VALUE)))
        );
        pnl_dadosPagamentoLayout.setVerticalGroup(
            pnl_dadosPagamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_dadosPagamentoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_dadosPagamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlb_tituloDesc)
                    .addGroup(pnl_dadosPagamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jlb_tituloDescontos)
                        .addComponent(jlb_tituloProventos)))
                .addGap(32, 32, 32)
                .addGroup(pnl_dadosPagamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlb_salarioBase)
                    .addComponent(jlb_salario))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnl_dadosPagamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlb_INSS)
                    .addComponent(jlb_inss))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnl_dadosPagamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlb_IRRF)
                    .addComponent(jlb_irrf))
                .addContainerGap(190, Short.MAX_VALUE))
            .addGroup(pnl_dadosPagamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jsp_desc, javax.swing.GroupLayout.DEFAULT_SIZE, 330, Short.MAX_VALUE))
        );

        pnl_total.setBackground(new java.awt.Color(255, 255, 255));
        pnl_total.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jlb_totalDescontos.setBackground(new java.awt.Color(0, 0, 0));
        jlb_totalDescontos.setFont(new java.awt.Font("MS PGothic", 0, 18)); // NOI18N
        jlb_totalDescontos.setText("Total Descontos");

        jlb_totalDesc.setBackground(new java.awt.Color(0, 0, 0));
        jlb_totalDesc.setFont(new java.awt.Font("MS PGothic", 0, 18)); // NOI18N
        jlb_totalDesc.setText("total desc");

        jlb_liqAReceber.setBackground(new java.awt.Color(0, 0, 0));
        jlb_liqAReceber.setFont(new java.awt.Font("MS PGothic", 1, 18)); // NOI18N
        jlb_liqAReceber.setText("Líquido a Receber");

        jlb_totalLiquido.setBackground(new java.awt.Color(0, 0, 0));
        jlb_totalLiquido.setFont(new java.awt.Font("MS PGothic", 0, 18)); // NOI18N
        jlb_totalLiquido.setText("total liq");

        jlb_FGTS.setBackground(new java.awt.Color(0, 0, 0));
        jlb_FGTS.setFont(new java.awt.Font("MS PGothic", 0, 18)); // NOI18N
        jlb_FGTS.setText("FGTS");

        jlb_fgts.setBackground(new java.awt.Color(0, 0, 0));
        jlb_fgts.setFont(new java.awt.Font("MS PGothic", 0, 18)); // NOI18N
        jlb_fgts.setText("fgts");

        javax.swing.GroupLayout pnl_totalLayout = new javax.swing.GroupLayout(pnl_total);
        pnl_total.setLayout(pnl_totalLayout);
        pnl_totalLayout.setHorizontalGroup(
            pnl_totalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(pnl_totalLayout.createSequentialGroup()
                .addGap(111, 111, 111)
                .addGroup(pnl_totalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jlb_FGTS, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlb_fgts, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnl_totalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlb_liqAReceber, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlb_totalLiquido, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(88, 88, 88)
                .addGroup(pnl_totalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlb_totalDesc, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlb_totalDescontos, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16))
        );
        pnl_totalLayout.setVerticalGroup(
            pnl_totalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_totalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_totalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_totalLayout.createSequentialGroup()
                        .addComponent(jlb_totalDescontos)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jlb_totalDesc))
                    .addGroup(pnl_totalLayout.createSequentialGroup()
                        .addGroup(pnl_totalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlb_liqAReceber)
                            .addComponent(jlb_FGTS))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnl_totalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlb_totalLiquido)
                            .addComponent(jlb_fgts))))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnl_dadosEmpresa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnl_dadosFunc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnl_dadosPagamento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnl_total, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnl_assin, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pnl_assin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(pnl_dadosEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pnl_dadosFunc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pnl_dadosPagamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pnl_total, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(54, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(1266, 726));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_voltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_voltarActionPerformed
        TelaHolerite hol = new TelaHolerite(acesso);
        hol.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_voltarActionPerformed

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
            java.util.logging.Logger.getLogger(Holerite.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Holerite.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Holerite.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Holerite.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Holerite().setVisible(true);
            }
        });
    }
    
    public void pagamento (int cod){
        this.codPagamento = cod;
        gerarHolerite();
    }
    
    /**
     * Atribui os valores buscados no banco às labels para visualizacao do usuario
     */
    public void gerarHolerite(){
	PagamentoDAO dao = new PagamentoDAO();
	dao.holerite(this.codPagamento);
        jlb_nome.setText(dao.nomeFunc);
        jlb_cargo.setText(dao.cargoSen); 
        jlb_data.setText(dao.data_pag.toString());
       
        jlb_inss.setText(duasCasas(dao.inss));
        jlb_irrf.setText(duasCasas(dao.irrf));
        jlb_fgts.setText(duasCasas(dao.fgts));
        jlb_totalLiquido.setText(duasCasas(dao.salario));
        
        jlb_totalDesc.setText(duasCasas(dao.inss+dao.irrf));
        jlb_salario.setText(duasCasas(dao.inss+dao.irrf+dao.salario));
    }

    /**
     * Faz a conversao de um valor float para decimal format com duas casas decimais
     * @param var - valor para conversao
     * @return valor convertido
     */
    public String duasCasas(float var){
        DecimalFormat df = new DecimalFormat("0.00");
        return df.format(var);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_voltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jlb_FGTS;
    private javax.swing.JLabel jlb_INSS;
    private javax.swing.JLabel jlb_IRRF;
    private javax.swing.JLabel jlb_cargo;
    private javax.swing.JLabel jlb_cnpjEmpresa;
    private javax.swing.JLabel jlb_data;
    private javax.swing.JLabel jlb_dataDoPagamento;
    private javax.swing.JLabel jlb_empregador;
    private javax.swing.JLabel jlb_endEmpresa;
    private javax.swing.JLabel jlb_fgts;
    private javax.swing.JLabel jlb_funcao;
    private javax.swing.JLabel jlb_inss;
    private javax.swing.JLabel jlb_irrf;
    private javax.swing.JLabel jlb_liqAReceber;
    private javax.swing.JLabel jlb_nome;
    private javax.swing.JLabel jlb_nomeDoFuncionario;
    private javax.swing.JLabel jlb_nomeEmpresa;
    private javax.swing.JLabel jlb_salario;
    private javax.swing.JLabel jlb_salarioBase;
    private javax.swing.JLabel jlb_tituloDesc;
    private javax.swing.JLabel jlb_tituloDescontos;
    private javax.swing.JLabel jlb_tituloProventos;
    private javax.swing.JLabel jlb_tituloRecibo;
    private javax.swing.JLabel jlb_totalDesc;
    private javax.swing.JLabel jlb_totalDescontos;
    private javax.swing.JLabel jlb_totalLiquido;
    private javax.swing.JSeparator jsp_desc;
    private javax.swing.JPanel pnl_assin;
    private javax.swing.JPanel pnl_dadosEmpresa;
    private javax.swing.JPanel pnl_dadosFunc;
    private javax.swing.JPanel pnl_dadosPagamento;
    private javax.swing.JPanel pnl_total;
    // End of variables declaration//GEN-END:variables
}