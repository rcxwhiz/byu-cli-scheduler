package model.id;

public class TitleCode
{
	TitleCode(int value)
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

	private final int value;
}
