package model.id;

public class PersonId
{
	PersonId(int value)
	{
		this.value = value;
	}

	public int getValue()
	{
		return value;
	}

	@Override
	public boolean equals(Object o)
	{
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		PersonId personId = (PersonId) o;
		return value == personId.value;
	}

	private final int value;
}
