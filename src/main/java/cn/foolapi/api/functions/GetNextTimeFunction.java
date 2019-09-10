package cn.foolapi.api.functions;

import java.util.Date;

public class GetNextTimeFunction  implements Function{

	@Override
	public String execute(String[] args) {
		Date d = new Date();
		int hour = d.getHours();
		String nexttime = hour+":00";
		//返回17:00格式的下一个整点时间
		return nexttime;
	}

	@Override
	public String getReferenceKey() {
		// TODO Auto-generated method stub
		return "getnexttime";
	}

}
