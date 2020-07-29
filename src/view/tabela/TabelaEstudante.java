/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.tabela;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import model.design.Estudante;

/**
 *
 * @author Carlos
 */
public class TabelaEstudante extends AbstractTableModel{
    private List<Estudante> est = new ArrayList<>();
    
        private String[] colunas = {"RM", "Nome"};

    @Override
    public int getRowCount() {
        return est.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    @Override
    public String getColumnName(int columnIndex){
        return this.colunas[columnIndex];
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch(columnIndex){
            case 0:
                return est.get(rowIndex).getRm();
            case 1:
                return est.get(rowIndex).getNome();
        }
        return null;
    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        switch(columnIndex){
            case 0:
                est.get(rowIndex).setRm((String)aValue);
                break;
            case 1:
                est.get(rowIndex).setNome((String)aValue);
                break;
        }
        this.fireTableRowsUpdated(rowIndex, rowIndex);
    }
    
    public void addRow(Estudante e){
        this.est.add(e);
        this.fireTableDataChanged();
    }
    
    public void removeRow(int rowIndex){
        this.est.remove(rowIndex);
        this.fireTableRowsDeleted(rowIndex, rowIndex);
    }
}
