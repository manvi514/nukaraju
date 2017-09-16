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
public class StudentGroup implements StudentArrayOperation {

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
	try
	{
	    if(Students==null)
		{
			throw new IllegalArgumentException;
		}
	}
	catch(Exception e)
	{
		e.printstack();
	}
		return Student;
	}

	@Override
	public void setStudents(Student[] students) {
		// Add your implementation here
	try
	{
		
			throw new IllegalArgumentException;
			
	}
	catch(IllegalArgumentException e)
		e.printstack();
	}

	@Override
	public Student getStudent(int index) {
		// Add your implementation here
		try
		{
			if((index<0 || index>=Student.length) && student==null)
				throw new IllegalArgumentException;
			Student[index]=student;
		}
		catch(IllegalArgumentException e)
			System.out.println(e);
		return Student;
	}

	@Override
	public void setStudent(Student student, int index) {
		// Add your implementation here
		try
		{
			if((index<0 || index>=Student.length) && student==null)
				throw new IllegalArgumentException;
			Student[index].append(student);
		}
		catch(IllegalArgumentException e)
			System.out.println(e);
	}

	@Override
	public void addFirst(Student student) {
		// Add your implementation here
	try
	{
		if(student==null)
			throw new IllegalArgumentException;
		Student[Student.length-1].append(student);
	}
	catch(IllegalArgumentException e)
		System.out.println(e);
	}

	@Override
	public void addLast(Student student) {
		// Add your implementation here
	try
	{
		if((index<0 || index>=Student.length))
			throw new IllegalArgumentException;
		student.remove();
	}

	@Override
	public void add(Student student, int index) {
		// Add your implementation here
	try
	{
		if(student==null)
			throw new IllegalArgumentException;
		Student st=Student[index];
		Student[0]=student;
		Student[Student.length-1]=st;
	}
	catch(IllegalArgumentException e)
		System.out.println(e);
	}

	@Override
	public void remove(int index) {
		// Add your implementation here
	try
	{
		if(Student[index]==null)
			throw new IllegalArgumentException;
		else
		{
			for(int i=0;i<Student.length;i++)
			{
			    if(Student[i]!=Student[index])
			        Student[i].remove();
			}
		}
	}
	catch(IllegalArgumentException e)
		System.out.println(e);
	}

	@Override
	public void remove(Student student) {
		// Add your implementation here
	try
	{
		if(student==null)
			throw new IllegalArgumentException;
		else
		student.remove();
	}
	catch(IllegalArgumentException e)
			System.out.println(e+"student not exists");
	}

	@Override
	public void removeFromIndex(int index) {
		// Add your implementation here
	try
	{
		if(index<0 || index>=Student.length)
			throw new IllegalArgumentException;
		for(int i=0;i<index;i++)
		{
	       Student[i].remove();
		}
	}
	catch(IllegalArgumentException e)
		System.out.println(e);
	}

	@Override
	public void removeFromElement(Student student) {
		// Add your implementation here
	try
	{
		int count=0;
		if(student==null)
			throw new IllegalArgumentException;
		for(int i=0;i<Student.length;i++)
		{
			if(Student[i]==(student))
				 count++;
		}
		for(int i=count;i<Student.length;i++)
		  Student[i].remove();	
	}
	catch(IllegalArgumentException e)
		System.out.println(e);
	}

	@Override
	public void removeToIndex(int index) {
		// Add your implementation here
	try
	{
		if(index<0 || index>=Student.length)
			throw new IllegalArgumentException;
		for(int i=0;i<index;i++)
			Student[i].remove();
	}
	catch(IllegalArgumentException e)
		System.out.println(e);
	}

	@Override
	public void removeToElement(Student student) {
		// Add your implementation here
	try
	{
		if(student==null)
			throw new IllegalArgumentException;
		for(int i=0;i<Student.length;i++)
		{
			if(Student[i]==student)
				Student[i].remove();
		}
	}
	catch(IllegalArgumentException e)
 		System.out.println(e);	
	}

	@Override
	public void bubbleSort() {
		// Add your implementation here
		for(int i=0;i<Student.length;i++)
		{
			for(int j=i;j<Student.length;j++)
			{
				if(Student[i]>Student[j])
				{
					Student st=Student[i];
					Student[i]=Student[j];
					Student[j]=st;
				}
			}
		}
	}

	@Override
	public Student[] getByBirthDate(Date date) {
		// Add your implementation here
		try
		{
			Student st;
			if(date==null)
				throw new IllegalArgumentException;
			for(int i=0;i<Student.length;i++)
			{
				if(Student.date==date)
				{
					st[i]=student;
				}
			}
	
		}
		return st;
	}

	@Override
	public Student[] getBetweenBirthDates(Date firstDate, Date lastDate) {
		// Add your implementation here
	try
	{
		if(firstDate==null && lastDate==null)
			throw new IllegalArgumentException;
		for(i=0;i<Student.length;i++)
		{
			if(Student[i].date>=firstDate && Student[i].date<=lastDate)
				Student st[i]=Student[i];
		}
	}
	catch(IllegalArgumentException e)
		System.out.println(e);
		return st;
	}

	@Override
	public Student[] getNearBirthDate(Date date, int days) {
		// Add your implementation here
		return null;
	}

	@Override
	public int getCurrentAgeByDate(int indexOfStudent) {
		// Add your implementation here
		return 0;
	}

	@Override
	public Student[] getStudentsByAge(int age) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getStudentsWithMaxAvgMark() {
		// Add your implementation here
		return null;
	}

	@Override
	public Student getNextStudent(Student student) {
		// Add your implementation here
		return null;
	}
}
