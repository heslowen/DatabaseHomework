package homework.dao.impl;

//ʵ�ֵײ㣨���ݷ��ʲ㣩�����Ա��¼ϵͳ�ӿ�

import homework.dao.ILoginDAO;
import homework.model.Operator;
import org.hibernate.SessionFactory;

public class LoginDAOImp implements ILoginDAO {
	// hibernate��SessionFactory������springע�룮
	private SessionFactory factory;

	// get/set������springע��ʱʹ��
	public SessionFactory getFactory() {
		return factory;
	}

	public void setFactory(SessionFactory factory) {
		this.factory = factory;
	}

	// �ж��ǲ���Ա�Ƿ����
	public Operator isOperator(String operatorName, String operatorPwd) {
		Operator operator = null;
		System.out.println("name "+operatorName);
		System.out.println("password "+operatorPwd);

        if(operatorName.equals("admin")&&operatorPwd.equals("123"))
        {
            operator = new Operator(1, "admin", "123", 1);
        }
/*		Session session = factory.openSession();
		Transaction ts = null;
		ts = session.beginTransaction();
		// String
		// query="select * from userInfo where userName=? and userPassword=?";
		try {
			Query query = session
					.createQuery("from Operator as a where a.operatorName='"
							+ operatorName + "' and a.operatorPwd='"
							+ operatorPwd + "'");
			List<Operator> list = query.list();
			Iterator it = list.iterator();
			if (!Hibernate.isInitialized(list))
				Hibernate.initialize(list);
			if (it.hasNext()) {
				operator = (Operator) it.next();
			}
		} catch (Exception e) {
			// TODO: handle exception
		}

		ts.commit();
		session.close();*/
		return operator;
	}

	
}
