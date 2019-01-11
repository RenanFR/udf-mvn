package hive.udf;

import org.apache.hadoop.hive.ql.exec.UDF;
import org.apache.hadoop.io.Text;


public class CaseConverter extends UDF{
	
	public Text evaluate(String inputColumn) {
		if (inputColumn == null) {
			return null;
		} else {
			return new Text(inputColumn.toUpperCase());
		}
	}
	
}
