import java.util.Date;

/**
 * A fix-sized array of students
 * array length should always be equal to the number of stored elements
 * after the element was removed the size of the array should be equal to the number of stored elements
 * after the element was added the size of the array should be equal to the number of stored elements
 * null elements are not allowed to be stored in the array
 * 
 * You may add new methods, fields to this class, but DO NOT RENAME any given class, interface or method
 * DO NOT PUT any classes into packages
 *
 */
public class StudentGroup implements StudentArrayOperation 
{

	private Student[] students;
	
	/**
	 * DO NOT remove or change this constructor, it will be used during task check
	 * @param length
	 */
	public StudentGroup(int length) {
		this.students = new Student[length];
	}

	@Override
	public Student[] getStudents() {
		// Add your implementation here
		if(students == null)
		{
			throw new IllegalArgumentException();
		}
		else {
		return students;}
	}

	@Override
	public void setStudents(Student[] students) {
		// Add your implementation here
		if(students == null)
		{
			throw new IllegalArgumentException();
		}
		else {
		this.students = students;
			;}
	}

	@Override
	public Student getStudent(int index)
	{
		if(students == null || index <0 || index > students.length)
		{
			throw new IllegalArgumentException();
		}
		// Add your implementation here
		else {
		return students[index];
		}
	}

	@Override
	public void setStudent(Student student, int index) 
	{
		if(students == null || index <0 || index > students.length)
		{
			throw new IllegalArgumentException();
		}
		else
		{
		// Add your implementation here
		this.students[index] = student;
		}
	}

	@Override
	public void addFirst(Student student) 
	{
		// Add your implementation here
		if(students == null)
		{
			throw new IllegalArgumentException();
		}
		else
		{
		// Add your implementation here
			students[0] = student;
		}
		
	}

	@Override
	public void addLast(Student student) 
	{
		if(students == null)
		{
			throw new IllegalArgumentException();
		}
		else
		{
		// Add your implementation here
			students[students.length-1] = student;
		}
		
	}

	@Override
	public void add(Student student, int index) 
	{
		if(students == null || index <0 || index > students.length)
		{
			throw new IllegalArgumentException();
		}
		else
		{
		// Add your implementation here
			Student[] array=new Student[students.length+1];
			for(int i=0;i<index;i++) {
				array[i]=students[i];}
			array[index]=student;
			for(int i=index+1;i<students.length;i++) {
				array[i]=students[i];}
			students=new Student[array.length];
			this.students=array;
		}
		// Add your implementation here
	}

	@Override
	public void remove(int index) 
	{
		if( students == null || index <0 || index > students.length)
		{
			throw new IllegalArgumentException();
		}
		else
		{
			//int i=0;
			Student[] array = new Student[students.length-1];
			int count=0;
			for(int i=0;i<index;i++) {
				array[count++]=students[i];}
			for(int i = index+1;i<students.length;i++) {
				array[count++]=students[i];}
			students = new Student[array.length];
			students = array;
		}
		// Add your implementation here
	}

	@Override
	public void remove(Student student) 
	{
		// Add your implementation here
		if( students == null)
		{
			throw new IllegalArgumentException();
		}
		else
		{
			Student[] array = new Student[students.length-1];
			int count=0,index=0,flag=0,a=0;
			for(int i=0;i<students.length;i++)
			{
				if(students[i] != student || a==1)
				{
					array[count++] = students[i];
				}
				else
				{
					flag=1;
					a=1;
				}
			}
			if(flag==0)
			{
				throw new IllegalArgumentException();
			}
			else
			{
				students = new Student[array.length];
				this.students = array;
			}
		}
	}

	@Override
	public void removeFromIndex(int index) 
	{
		if( students == null || index <0 || index >= students.length)
		{
			throw new IllegalArgumentException();
		}
		else
		{
			Student[] array = new Student[students.length + 1 - (students.length-index)];
			int count=0;
			for(int i=0;i<=index;i++)
			{
				array[count++] = students[i];
			}
			students = new Student[array.length];
			this.students = array;
			
		}
		// Add your implementation here
	}

	@Override
	public void removeFromElement(Student student) 
	{
		if( students == null)
		{
			throw new IllegalArgumentException();
		}
		else
		{
			
		}
		// Add your implementation here
		
	}

	@Override
	public void removeToIndex(int index) 
	{
		if( students == null || index <0 || index >= students.length)
		{
			throw new IllegalArgumentException();
		}
		// Add your implementation here
	}

	@Override
	public void removeToElement(Student student) 
	{
		if( students == null)
		{
			throw new IllegalArgumentException();
		}
		// Add your implementation here
	}

	@Override
	public void bubbleSort() {
		// Add your implementation here
	}

	@Override
	public Student[] getByBirthDate(Date date) 
	{
		if(date == null)
		{
			throw new IllegalArgumentException();
		}
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getBetweenBirthDates(Date firstDate, Date lastDate) 
	{
		if(firstDate == null || lastDate == null)
		{
			throw new IllegalArgumentException();
		}
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getNearBirthDate(Date date, int days) {
		if(date == null)
		{
			throw new IllegalArgumentException();
		}
		// Add your implementation here
		return null;
	}

	@Override
	public int getCurrentAgeByDate(int indexOfStudent) 
	{
		if(indexOfStudent == 0)
		{
			throw new IllegalArgumentException();
		}
		// Add your implementation here
		return 0;
	}

	@Override
	public Student[] getStudentsByAge(int age) 
	{
		int i=0,count=0,itr=0;
		for(i=0;i<students.length;i++)
		{

		}
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getStudentsWithMaxAvgMark() 
	{
		// Add your implementation here
		int i=0,count=0,itr=0;
		double max=0;
		for(i=0;i<students.length;i++)
		{
			if(max < students[i].getAvgMark())
			{
				max = students[i].getAvgMark();
				//count++;
			}
		}
		for(i=0;i<students.length;i++)
		{
			if(max == students[i].getAvgMark())
			{
				count++;
				//count++;
			}
		}
		Student[] array = new Student[count];
		for(i=0;i<students.length;i++)
		{
			if(max == students[i].getAvgMark())
			{
				array[itr++] = students[i];
			}
		}
		return array;
	}

	@Override
	public Student getNextStudent(Student student) 
	{
		if( students == null)
		{
			throw new IllegalArgumentException();
		}
		else
		{
			int i=0,count=0,ind=0;
			for(i=0;i<students.length;i++)
			{
				if(students[i]==student)
				{
					count=1;
					ind = i;
					break;
					//return students[i+1];
					//break;
				}
			}
			if(count==1)
				return students[ind+1];
			else if (count==0)
			{
				throw new IllegalArgumentException();
		}
			return students[ind+1];
		// Add your implementation here
		//return null;
		}
	}
}
