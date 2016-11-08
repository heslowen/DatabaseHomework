/*
 * Generated by MyEclipse Struts
 * Template path: templates/java/JavaClass.vtl
 */
package homework.struts.action;

import homework.model.Operator;
import homework.service.ILogin;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 * 功能:用户登录
 * 
 */
public class LoginAction extends BaseAction {
	/*
	 * Generated fields
	 */
	private String people;

	public String getPeople() {
		return people;
	}

	public void setPeople(String people) {
		this.people = people;
	}

	/** password property */
	private String password;

	/** account property */
	private String account;
	/** 
	 * Returns the password.
	 * @return String
	 */
	public String getPassword() {
		return password;
	}

	/** 
	 * Set the password.
	 * @param password The password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/** 
	 * Returns the account.
	 * @return String
	 */
	public String getAccount() {
		return account;
	}

	/** 
	 * Set the account.
	 * @param account The account to set
	 */
	public void setAccount(String account) {
		this.account = account;
	}
	
	public String execute(){
		//加载Spring配置文件，初始化IOC容器
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("/applicationContext.xml");
		//从容器接管bean
		ILogin login=(ILogin)context.getBean("loginservice");
		if(people.equals("student")){
			System.out.println("fffffffffffffffffffffffff");
		}
		//调用业务层的方法判断是否是合法用户
		Operator operator=login.isOperator(account, password);
		if(operator!=null){
			this.session().setAttribute("operator", operator);
			return SUCCESS;
		}else{
			return ERROR;
		}
	}
}