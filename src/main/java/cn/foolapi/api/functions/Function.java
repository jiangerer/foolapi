package cn.foolapi.api.functions;

public interface Function {
	String execute(String[] args);

	String getReferenceKey();
}
