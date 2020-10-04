package model.id;

public class NetId
{
	NetId(String value)
	{
		this.value = value;
	}

	public String getValue()
	{
		return value;
	}

	@Override
	public boolean equals(Object o)
	{
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		NetId netId = (NetId) o;
		return value.equals(netId.value);
	}

	private final String value;
}
