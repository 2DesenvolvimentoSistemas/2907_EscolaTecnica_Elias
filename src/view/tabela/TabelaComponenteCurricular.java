/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.tabela;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import model.design.ComponenteCurricular;

/**
 *
 * @author Carlos
 */
public class TabelaComponenteCurricular extends AbstractTableModel{
    private List<ComponenteCurricular> compCurr = new ArrayList<>();
    private String[] colunas = {"Sigla", "Componente", "Carga Horária"};

    @Override
    public int getRowCount() {
        return compCurr.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }
    
    public String getColumnName(int columnIndex){
        return this.colunas[columnIndex];
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch(columnIndex){
            case 0:
                return compCurr.get(rowIndex).getSigla();
            case 1:
                return compCurr.get(rowIndex).getComponente();
            case 2:
                return compCurr.get(rowIndex).getCargaHoraria();
        }
        return null;
    }
    
    public void setValueAt(Object aValue, int rowIndex, int ColumnIndex){
        switch(ColumnIndex){
            case 0:
                compCurr.get(rowIndex).setSigla((String)aValue);
                break;
            case 1:
                compCurr.get(rowIndex).setComponente((String)aValue);
                break;
            case 2:
                compCurr.get(rowIndex).setCargaHoraria((Double)aValue);
                break;
        }
        this.fireTableRowsUpdated(rowIndex, rowIndex);
    }
    
    public void addRow(ComponenteCurricular Comp){
        this.compCurr.add(Comp);
        this.fireTableDataChanged();
    }
    
    public void deleteRow(int rowIndex){
        this.compCurr.remove(rowIndex);
        this.fireTableRowsDeleted(rowIndex, rowIndex);
    }
}
