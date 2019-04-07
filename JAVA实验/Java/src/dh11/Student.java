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
			//俩个相比较的是同一个类对象
			Student s = new Student();
			return this.name.equals(s.name)&&this.age==s.age; 
			
			//比较的两个数不是同一个类的对象
			//格式：对象名  instanceof 类名
			//表示判断该对象名是不是该类名的一个对象
		//	if(!(obj instanceof Student)) {
		//		return false;
		//	}
		
		}  */
		
		
		//创建并返回此对象的一个副本
		@Override
		protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
		}
		
		//对于不需要对象调用的方法进行回收，但是回收的时间不确定
		@Override
		protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
		}
		 
		
		
}



