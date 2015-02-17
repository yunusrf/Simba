/*******************************************************************************
 *    Copyright 2015 Dorian Perkins, Younghwan Go, Nitin Agrawal, Akshat Aranya
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 *******************************************************************************/
package com.necla.simba.protocol;
// Generated by proto2javame, Sun Feb 08 14:12:26 KST 2015.

import java.io.IOException;
import java.io.InputStream;
import java.util.*;
import net.jarlehansen.protobuf.javame.UninitializedMessageException;
import net.jarlehansen.protobuf.javame.input.InputReader;
import net.jarlehansen.protobuf.javame.input.DelimitedInputStream;
import net.jarlehansen.protobuf.javame.input.DelimitedSizeUtil;
import net.jarlehansen.protobuf.javame.ComputeSizeUtil;
import net.jarlehansen.protobuf.javame.output.OutputWriter;
import net.jarlehansen.protobuf.javame.AbstractOutputWriter;
import net.jarlehansen.protobuf.javame.input.taghandler.UnknownTagHandler;
import net.jarlehansen.protobuf.javame.input.taghandler.DefaultUnknownTagHandlerImpl;

public final class ObjectFragment extends AbstractOutputWriter {
	private static UnknownTagHandler unknownTagHandler = DefaultUnknownTagHandlerImpl.newInstance();

	private final int trans_id;
	private static final int fieldNumberTrans_id = 1;

	private final int oid;
	private static final int fieldNumberOid = 2;

	private final int offset;
	private static final int fieldNumberOffset = 3;

	private final net.jarlehansen.protobuf.javame.ByteString data;
	private static final int fieldNumberData = 4;

	private final boolean eof;
	private static final int fieldNumberEof = 5;
	private final boolean hasEof;


	public static Builder newBuilder() {
		return new Builder();
	}

	private ObjectFragment(final Builder builder) {
		if (builder.hasTrans_id && builder.hasOid && builder.hasOffset && builder.hasData ) {
			this.trans_id = builder.trans_id;
			this.oid = builder.oid;
			this.offset = builder.offset;
			this.data = builder.data;
			this.eof = builder.eof;
			this.hasEof = builder.hasEof;
		} else {
			throw new UninitializedMessageException("Not all required fields were included (false = not included in message), " + 
				" trans_id:" + builder.hasTrans_id + " oid:" + builder.hasOid + " offset:" + builder.hasOffset + " data:" + builder.hasData + "");
		}
	}

	public static class Builder {
		private int trans_id;
		private boolean hasTrans_id = false;

		private int oid;
		private boolean hasOid = false;

		private int offset;
		private boolean hasOffset = false;

		private net.jarlehansen.protobuf.javame.ByteString data;
		private boolean hasData = false;

		private boolean eof;
		private boolean hasEof = false;


		private Builder() {
		}

		public Builder setTrans_id(final int trans_id) {
			this.trans_id = trans_id;
			this.hasTrans_id = true;
			return this;
		}

		public Builder setOid(final int oid) {
			this.oid = oid;
			this.hasOid = true;
			return this;
		}

		public Builder setOffset(final int offset) {
			this.offset = offset;
			this.hasOffset = true;
			return this;
		}

		public Builder setData(final net.jarlehansen.protobuf.javame.ByteString data) {
			this.data = data;
			this.hasData = true;
			return this;
		}

		public Builder setEof(final boolean eof) {
			this.eof = eof;
			this.hasEof = true;
			return this;
		}

		public ObjectFragment build() {
			return new ObjectFragment(this);
		}
	}

	public int getTrans_id() {
		return trans_id;
	}

	public int getOid() {
		return oid;
	}

	public int getOffset() {
		return offset;
	}

	public net.jarlehansen.protobuf.javame.ByteString getData() {
		return data;
	}

	public boolean getEof() {
		return eof;
	}

	public boolean hasEof() {
		return hasEof;
	}

	public String toString() {
		final String TAB = "   ";
		String retValue = "";
		retValue += this.getClass().getName() + "(";
		retValue += "trans_id = " + this.trans_id + TAB;
		retValue += "oid = " + this.oid + TAB;
		retValue += "offset = " + this.offset + TAB;
		retValue += "data = " + this.data + TAB;
		if(hasEof) retValue += "eof = " + this.eof + TAB;
		retValue += ")";

		return retValue;
	}

	// Override
	public int computeSize() {
		int totalSize = 0;
		totalSize += ComputeSizeUtil.computeIntSize(fieldNumberTrans_id, trans_id);
		totalSize += ComputeSizeUtil.computeIntSize(fieldNumberOid, oid);
		totalSize += ComputeSizeUtil.computeIntSize(fieldNumberOffset, offset);
		totalSize += ComputeSizeUtil.computeByteStringSize(fieldNumberData, data);
		if(hasEof) totalSize += ComputeSizeUtil.computeBooleanSize(fieldNumberEof, eof);
		totalSize += computeNestedMessageSize();

		return totalSize;
	}

	private int computeNestedMessageSize() {
		int messageSize = 0;

		return messageSize;
	}

	// Override
	public void writeFields(final OutputWriter writer) throws IOException {
		writer.writeInt(fieldNumberTrans_id, trans_id);
		writer.writeInt(fieldNumberOid, oid);
		writer.writeInt(fieldNumberOffset, offset);
		writer.writeByteString(fieldNumberData, data);
		if(hasEof) writer.writeBoolean(fieldNumberEof, eof);
	}

	static ObjectFragment parseFields(final InputReader reader) throws IOException {
		int nextFieldNumber = getNextFieldNumber(reader);
		final ObjectFragment.Builder builder = ObjectFragment.newBuilder();

		while (nextFieldNumber > 0) {
			if(!populateBuilderWithField(reader, builder, nextFieldNumber)) {
				reader.getPreviousTagDataTypeAndReadContent();
			}
			nextFieldNumber = getNextFieldNumber(reader);
		}

		return builder.build();
	}

	static int getNextFieldNumber(final InputReader reader) throws IOException {
		return reader.getNextFieldNumber();
	}

	static boolean populateBuilderWithField(final InputReader reader, final Builder builder, final int fieldNumber) throws IOException {
		boolean fieldFound = true;
		switch (fieldNumber) {
			case fieldNumberTrans_id:
				builder.setTrans_id(reader.readInt(fieldNumber));
				break;
			case fieldNumberOid:
				builder.setOid(reader.readInt(fieldNumber));
				break;
			case fieldNumberOffset:
				builder.setOffset(reader.readInt(fieldNumber));
				break;
			case fieldNumberData:
				builder.setData(reader.readByteString(fieldNumber));
				break;
			case fieldNumberEof:
				builder.setEof(reader.readBoolean(fieldNumber));
				break;
		default:
			fieldFound = false;
		}
		return fieldFound;
	}

	public static void setUnknownTagHandler(final UnknownTagHandler unknownTagHandler) {
		ObjectFragment.unknownTagHandler = unknownTagHandler;
	}

	public static ObjectFragment parseFrom(final byte[] data) throws IOException {
		return parseFields(new InputReader(data, unknownTagHandler));
	}

	public static ObjectFragment parseFrom(final InputStream inputStream) throws IOException {
		return parseFields(new InputReader(inputStream, unknownTagHandler));
	}

	public static ObjectFragment parseDelimitedFrom(final InputStream inputStream) throws IOException {
		final int limit = DelimitedSizeUtil.readDelimitedSize(inputStream);
		return parseFields(new InputReader(new DelimitedInputStream(inputStream, limit), unknownTagHandler));
	}
}