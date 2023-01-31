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

import com.teamdire.university_restaurant.model.Refeicao;

import java.text.SimpleDateFormat;

/**
 *
 * @author Daniel
 */
public class IUDetalhesRefeicao extends javax.swing.JFrame {

    /**
     * Creates new form IUDetalhesRefeicao
     */
    public IUDetalhesRefeicao(Refeicao refeicao) {
        String laf = javax.swing.UIManager.getSystemLookAndFeelClassName();
        try {
            javax.swing.UIManager.setLookAndFeel(laf);
        } catch (Exception e) {
            e.printStackTrace();
        }

        initComponents();

        String[] tipos = {"Café da manhã", "Almoço", "Janta"};

        // Seta todas as labels com os dados da refeição
        SimpleDateFormat dtf = new SimpleDateFormat("dd/MM/yyyy");
        dataServentiaLabel.setText(dtf.format(refeicao.getDataServentia().getTime()));
        qtdTiquetesLabel.setText(Integer.toString(refeicao.getQuantidadeTiquetes()));
        bebidaLabel.setText(refeicao.getBebida());
        guarnicaoLabel.setText(refeicao.getGuarnicao());
        saladaLabel.setText(refeicao.getSalada());
        sobremesaLabel.setText(refeicao.getSobremesa());
        pratoPrincipalLabel.setText(refeicao.getPratoPrincipal());
        nomeLabel.setText(refeicao.getNome());
        tipoLabel.setText(tipos[refeicao.getTipoRefeicao().ordinal()]);
        // Seta o text area com os alimentos base
        // Para cada linha do arraylist, adiciona uma linha no text area
        String alimentosBase = "";
        for (String alimento : refeicao.getAlimentosBase()) {
            alimentosBase += alimento + "\n";
        }
        aBaseTextArea.setText(alimentosBase);
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        dataServentiaLabel = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        qtdTiquetesLabel = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        aBaseTextArea = new javax.swing.JTextArea();
        jLabel8 = new javax.swing.JLabel();
        nomeLabel = new javax.swing.JLabel();
        tipoLabel = new javax.swing.JLabel();
        pratoPrincipalLabel = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        guarnicaoLabel = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        saladaLabel = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        bebidaLabel = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        sobremesaLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setText("Nome:");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("Tipo:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("Data de serventia:");

        dataServentiaLabel.setText("jLabel4");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setText("Qtd. de tiquetes disponíveis:");

        qtdTiquetesLabel.setText("jLabel6");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setText("Alimentos base:");

        jScrollPane1.setEnabled(false);

        aBaseTextArea.setEditable(false);
        aBaseTextArea.setColumns(20);
        aBaseTextArea.setRows(5);
        jScrollPane1.setViewportView(aBaseTextArea);

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel8.setText("Prato principal:");

        nomeLabel.setText("jLabel9");

        tipoLabel.setText("jLabel10");

        pratoPrincipalLabel.setText("jLabel11");

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel12.setText("Guarnição:");

        guarnicaoLabel.setText("jLabel13");

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel14.setText("Salada:");

        saladaLabel.setText("jLabel15");

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel16.setText("Bebida:");

        bebidaLabel.setText("jLabel17");

        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel18.setText("Sobremesa:");

        sobremesaLabel.setText("jLabel19");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel18)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sobremesaLabel))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(saladaLabel))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pratoPrincipalLabel))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel7)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(tipoLabel))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(nomeLabel))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel3)
                                .addComponent(dataServentiaLabel))
                            .addGap(50, 50, 50)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(qtdTiquetesLabel)
                                .addComponent(jLabel5)))
                        .addComponent(jScrollPane1))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(guarnicaoLabel))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bebidaLabel)))
                .addGap(25, 25, 25))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(nomeLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tipoLabel))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dataServentiaLabel)
                    .addComponent(qtdTiquetesLabel))
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(pratoPrincipalLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(guarnicaoLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(bebidaLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(saladaLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(sobremesaLabel))
                .addGap(25, 25, 25))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea aBaseTextArea;
    private javax.swing.JLabel bebidaLabel;
    private javax.swing.JLabel dataServentiaLabel;
    private javax.swing.JLabel guarnicaoLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel nomeLabel;
    private javax.swing.JLabel pratoPrincipalLabel;
    private javax.swing.JLabel qtdTiquetesLabel;
    private javax.swing.JLabel saladaLabel;
    private javax.swing.JLabel sobremesaLabel;
    private javax.swing.JLabel tipoLabel;
    // End of variables declaration//GEN-END:variables
}