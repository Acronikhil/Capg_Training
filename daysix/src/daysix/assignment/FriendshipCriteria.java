package daysix.assignment;

import java.util.Objects;

public class FriendshipCriteria<T , S> implements Comparable<Object> {
	
	private T name;
	private S age;
	
	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	public T getName() {
		return name;
	}
	public void setName(T name) {
		this.name = name;
	}
	public S getAge() {
		return age;
	}
	public void setAge(S age) {
		this.age = age;
	}
	@Override
	public int hashCode() {
		return Objects.hash(age, name);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		FriendshipCriteria other = (FriendshipCriteria) obj;
		return Objects.equals(age, other.age) && Objects.equals(name, other.name);
	}
	@Override
	public String toString() {
		return "FriendshipCriteria [name=" + name + ", age=" + age + "]";
	}
	public FriendshipCriteria(T name, S age) {
		super();
		this.name = name;
		this.age = age;
	}
	public FriendshipCriteria() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
