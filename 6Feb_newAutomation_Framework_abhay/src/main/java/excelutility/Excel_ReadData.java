package excelutility;

public interface Excel_ReadData 
{
	public String Excelreaddata(String path, int sheet_no, int column_no, int row_no);
	public int ExcelRowcount(String path, int sheet_no);
}
