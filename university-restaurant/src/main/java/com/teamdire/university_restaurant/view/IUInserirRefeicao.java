/*
 * Copyright (C) 2023 Daniel
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.teamdire.university_restaurant.view;

import com.teamdire.university_restaurant.controller.ControladorRefeicao;
import com.teamdire.university_restaurant.model.TipoRefeicao;
import com.teamdire.university_restaurant.model.UniversityRestaurant;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author Daniel
 */
public class IUInserirRefeicao extends javax.swing.JFrame {

    private ControladorRefeicao controladorRefeicao;
    /**
     * Creates new form IUInserirRefeicao
     */
    public IUInserirRefeicao() {
        controladorRefeicao = new ControladorRefeicao();

        String laf = javax.swing.UIManager.getSystemLookAndFeelClassName();
        try {
            javax.swing.UIManager.setLookAndFeel(laf);
        } catch (Exception e) {
            e.printStackTrace();
        }
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        iuTipoRefeicao = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        iuDataServentia = new com.toedter.calendar.JDateChooser();
        jLabel3 = new javax.swing.JLabel();
        iuQtdTickets = new javax.swing.JSpinner();
        jLabel4 = new javax.swing.JLabel();
        iuNomeRefeicao = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        iuAlimentosBase = new javax.swing.JTextArea();
        jLabel6 = new javax.swing.JLabel();
        iuGuarnicao = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        iuSalada = new javax.swing.JTextField();
        iuBebida = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        iuSobremesa = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 25), new java.awt.Dimension(0, 25), new java.awt.Dimension(32767, 25));

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setLocation(new java.awt.Point(0, 0));
        setName("Inserir refeição"); // NOI18N

        jLabel1.setText("Tipo de refeição:");

        iuTipoRefeicao.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Café da manhã", "Almoço", "Janta" }));
        iuTipoRefeicao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iuTipoRefeicaoActionPerformed(evt);
            }
        });

        jLabel2.setText("Data de serventia:");

        jLabel3.setText("Quantidade de tiquetes:");

        iuQtdTickets.setModel(new javax.swing.SpinnerNumberModel(50, 0, null, 1));
        iuQtdTickets.setVerifyInputWhenFocusTarget(false);

        jLabel4.setText("Nome da refeição:");

        jLabel5.setText("Alimentos base (um por linha):");

        iuAlimentosBase.setColumns(20);
        iuAlimentosBase.setRows(5);
        jScrollPane1.setViewportView(iuAlimentosBase);

        jLabel6.setText("Guarnição:");

        jLabel7.setText("Salada:");

        iuBebida.setText("Bebida:");

        iuSobremesa.setText("Sobremesa:");

        jButton1.setText("Inserir refeição");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(iuDataServentia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel1)
                                    .addComponent(iuTipoRefeicao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel4)
                                    .addComponent(iuNomeRefeicao, javax.swing.GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE)
                                    .addComponent(jLabel3)
                                    .addComponent(iuQtdTickets)))
                            .addComponent(jScrollPane1))
                        .addGap(25, 25, 25))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(102, 102, 102))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(iuBebida)
                                    .addComponent(iuGuarnicao)
                                    .addComponent(jTextField4, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE))
                                .addGap(18, 18, 18)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(iuSobremesa)
                            .addComponent(iuSalada, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(25, 25, 25)
                                .addComponent(filler1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(iuTipoRefeicao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(iuNomeRefeicao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(iuDataServentia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(iuQtdTickets, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(iuSalada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(iuGuarnicao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(iuBebida)
                    .addComponent(iuSobremesa))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(filler1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addGap(25, 25, 25))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void iuTipoRefeicaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iuTipoRefeicaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_iuTipoRefeicaoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // Pode ser byte porque são só 3 opções
        byte tipoRefeicaoValue = (byte) iuTipoRefeicao.getSelectedIndex();
        String nomeRefeicao = iuNomeRefeicao.getText();
        // Primeiro pega a daga. Depois da verificação, converte pra Calendar.
        Date dataServentiaDateVal = iuDataServentia.getDate();
        int qtdTickets = (int) iuQtdTickets.getValue();
        String alimentosBaseText = iuAlimentosBase.getText();
        String salada = iuSalada.getText();
        String guarnicao = iuGuarnicao.getText();
        String bebida = jTextField4.getText();
        String sobremesa = jTextField5.getText();

        // Se algum dos campos estiver vazio, exibe uma mensagem de erro
        if (nomeRefeicao.equals("") || dataServentiaDateVal == null ||
                alimentosBaseText.equals("") || salada.equals("") ||
                guarnicao.equals("") || bebida.equals("") || sobremesa.equals("")) {
            JOptionPane.showMessageDialog(null, "Por favor, preencha todos os campos.");
            return;
        }

        // Date -> Calendar
        Calendar dataServentia = Calendar.getInstance();
        dataServentia.setTime(dataServentiaDateVal);

        // Para cada linha do campo de alimentos base, adiciona no array
        ArrayList<String> alimentosBase = new ArrayList<>(Arrays.asList(alimentosBaseText.split("\n")));

        Boolean sucesso = controladorRefeicao.inserirNovaRefeicao(tipoRefeicaoValue, dataServentia, qtdTickets,
                nomeRefeicao, alimentosBase, guarnicao, salada, bebida, sobremesa);

        if (Boolean.TRUE.equals(sucesso)) {
            JOptionPane.showMessageDialog(null, "Refeição inserida com sucesso!");
            this.dispose();
        } else {
            JOptionPane.showMessageDialog(null, "Erro: essa refeição já exsite.");
        }

        System.out.println(UniversityRestaurant.getRefeicoes().get(0).getNome());
    }//GEN-LAST:event_jButton1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.Box.Filler filler1;
    private javax.swing.JTextArea iuAlimentosBase;
    private javax.swing.JLabel iuBebida;
    private com.toedter.calendar.JDateChooser iuDataServentia;
    private javax.swing.JTextField iuGuarnicao;
    private javax.swing.JTextField iuNomeRefeicao;
    private javax.swing.JSpinner iuQtdTickets;
    private javax.swing.JTextField iuSalada;
    private javax.swing.JLabel iuSobremesa;
    private javax.swing.JComboBox<String> iuTipoRefeicao;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    // End of variables declaration//GEN-END:variables
}
