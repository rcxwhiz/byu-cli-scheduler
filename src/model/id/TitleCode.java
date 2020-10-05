package model.id;

import java.util.Objects;

public class TitleCode
{
	public TitleCode(int value)
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
		TitleCode titleCode = (TitleCode) o;
		return value == titleCode.value;
	}

	@Override
	public int hashCode()
	{
		return Objects.hash(value);
	}

	private final int value;
}
