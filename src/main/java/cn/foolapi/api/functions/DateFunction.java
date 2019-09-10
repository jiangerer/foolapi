package cn.foolapi.api.functions;

import java.text.SimpleDateFormat;
import java.util.Date;

import cn.foolapi.api.utils.StringUtil;

public class DateFunction  implements Function{

	@Override
	public String execute(String[] args) {
		if (args.length == 0 ||StringUtil.isEmpty(args[0])) {
			return getCurrentDate("yyyy-MM-dd");
		} else {
			return getCurrentDate(args[0]);
			
		}
	}

	private String getCurrentDate(String pattern) {
		SimpleDateFormat format = new SimpleDateFormat(pattern);
		String str = format.format(new Date());
		return str;
	}
	
	@Override
	public String getReferenceKey() {
		// TODO Auto-generated method stub
		return "date";
	}

}
