package model.id;

import java.util.Objects;

public class NetId
{
	public NetId(String value)
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

	@Override
	public int hashCode()
	{
		return Objects.hash(value);
	}

	private final String value;
}
