package dh11;

class Student  implements cloneable{
		String name;
		int age;
		public Student() {
			super();
			// TODO Auto-generated constructor stub
		}
		public Student(String name, int age) {
			super();
			this.name = name;
			this.age = age;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		
		
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Student other = (Student) obj;
			if (age != other.age)
				return false;
			if (name == null) {
				if (other.name != null)
					return false;
			} else if (!name.equals(other.name))
				return false;
			return true;
		}
		
	/*	@Override
		public boolean equals(Object obj) {
			// TODO Auto-generated method stub
			//return this==obj;
			Student s = (Student) obj;
			if(this.name.equals(s.name)&& this.age==s.age){
				return true;
			}
			else{
				return false;
			}
		
		
		}
		 */
		
		
	/*	@Override
		public boolean equals(Object obj) {
			if(this==obj) {
				return true;
			}
			//������Ƚϵ���ͬһ�������
			Student s = new Student();
			return this.name.equals(s.name)&&this.age==s.age; 
			
			//�Ƚϵ�����������ͬһ����Ķ���
			//��ʽ��������  instanceof ����
			//��ʾ�жϸö������ǲ��Ǹ�������һ������
		//	if(!(obj instanceof Student)) {
		//		return false;
		//	}
		
		}  */
		
		
		//���������ش˶����һ������
		@Override
		protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
		}
		
		//���ڲ���Ҫ������õķ������л��գ����ǻ��յ�ʱ�䲻ȷ��
		@Override
		protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
		}
		 
		
		
}



