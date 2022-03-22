package utilities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Timem {
	
	public  String time()
	{String  sdf= new SimpleDateFormat("dd_MM_yyyy _HH_mm_ss").format(new Date());
	//System.out.println(sdf);
	return sdf;	
	}

}
