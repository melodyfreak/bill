package gui.model;
 
import java.util.ArrayList;
import java.util.List;
 
import javax.swing.event.TableModelListener;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.TableModel;

import entity.Category;
import service.CategoryService;
 
public class CategoryTableModel extends AbstractTableModel{
 
    String[] columnNames = new String[]{"��������","���Ѵ���"};
    public List<Category> cs = new CategoryService().list();
     
   
    @Override
    public int getRowCount() {
        // TODO Auto-generated method stub
        return cs.size();
    }
 
    @Override
    public int getColumnCount() {
        // TODO Auto-generated method stub
        return columnNames.length;
    }
 
    @Override
    public String getColumnName(int columnIndex) {
        // TODO Auto-generated method stub
        return columnNames[columnIndex];
    }
 
 
    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        // TODO Auto-generated method stub
        return false;
    }
 
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        // TODO Auto-generated method stub
    	Category h=cs.get(rowIndex);
        if(0==columnIndex)
            return h.name;
        if(1==columnIndex)
            return h.recordNumber;
        return null;
    }
 
    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        // TODO Auto-generated method stub
         
    }
 
    @Override
    public void addTableModelListener(TableModelListener l) {
        // TODO Auto-generated method stub
         
    }
 
    @Override
    public void removeTableModelListener(TableModelListener l) {
        // TODO Auto-generated method stub
         
    }
 
}