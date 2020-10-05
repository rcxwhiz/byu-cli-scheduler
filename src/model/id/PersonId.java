package model.id;

import java.util.Objects;

public class PersonId
{
	public PersonId(int value)
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

	@Override
	public int hashCode()
	{
		return Objects.hash(value);
	}

	private final int value;
}
