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
// Generated by proto2javame, Sun Feb 08 14:12:31 KST 2015.

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

public final class RegisterDevice extends AbstractOutputWriter {
	private static UnknownTagHandler unknownTagHandler = DefaultUnknownTagHandlerImpl.newInstance();

	private final String deviceId;
	private static final int fieldNumberDeviceId = 1;

	private final String userId;
	private static final int fieldNumberUserId = 2;

	private final String password;
	private static final int fieldNumberPassword = 3;


	public static Builder newBuilder() {
		return new Builder();
	}

	private RegisterDevice(final Builder builder) {
		if (builder.hasDeviceId && builder.hasUserId && builder.hasPassword ) {
			this.deviceId = builder.deviceId;
			this.userId = builder.userId;
			this.password = builder.password;
		} else {
			throw new UninitializedMessageException("Not all required fields were included (false = not included in message), " + 
				" deviceId:" + builder.hasDeviceId + " userId:" + builder.hasUserId + " password:" + builder.hasPassword + "");
		}
	}

	public static class Builder {
		private String deviceId;
		private boolean hasDeviceId = false;

		private String userId;
		private boolean hasUserId = false;

		private String password;
		private boolean hasPassword = false;


		private Builder() {
		}

		public Builder setDeviceId(final String deviceId) {
			this.deviceId = deviceId;
			this.hasDeviceId = true;
			return this;
		}

		public Builder setUserId(final String userId) {
			this.userId = userId;
			this.hasUserId = true;
			return this;
		}

		public Builder setPassword(final String password) {
			this.password = password;
			this.hasPassword = true;
			return this;
		}

		public RegisterDevice build() {
			return new RegisterDevice(this);
		}
	}

	public String getDeviceId() {
		return deviceId;
	}

	public String getUserId() {
		return userId;
	}

	public String getPassword() {
		return password;
	}

	public String toString() {
		final String TAB = "   ";
		String retValue = "";
		retValue += this.getClass().getName() + "(";
		retValue += "deviceId = " + this.deviceId + TAB;
		retValue += "userId = " + this.userId + TAB;
		retValue += "password = " + this.password + TAB;
		retValue += ")";

		return retValue;
	}

	// Override
	public int computeSize() {
		int totalSize = 0;
		totalSize += ComputeSizeUtil.computeStringSize(fieldNumberDeviceId, deviceId);
		totalSize += ComputeSizeUtil.computeStringSize(fieldNumberUserId, userId);
		totalSize += ComputeSizeUtil.computeStringSize(fieldNumberPassword, password);
		totalSize += computeNestedMessageSize();

		return totalSize;
	}

	private int computeNestedMessageSize() {
		int messageSize = 0;

		return messageSize;
	}

	// Override
	public void writeFields(final OutputWriter writer) throws IOException {
		writer.writeString(fieldNumberDeviceId, deviceId);
		writer.writeString(fieldNumberUserId, userId);
		writer.writeString(fieldNumberPassword, password);
	}

	static RegisterDevice parseFields(final InputReader reader) throws IOException {
		int nextFieldNumber = getNextFieldNumber(reader);
		final RegisterDevice.Builder builder = RegisterDevice.newBuilder();

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
			case fieldNumberDeviceId:
				builder.setDeviceId(reader.readString(fieldNumber));
				break;
			case fieldNumberUserId:
				builder.setUserId(reader.readString(fieldNumber));
				break;
			case fieldNumberPassword:
				builder.setPassword(reader.readString(fieldNumber));
				break;
		default:
			fieldFound = false;
		}
		return fieldFound;
	}

	public static void setUnknownTagHandler(final UnknownTagHandler unknownTagHandler) {
		RegisterDevice.unknownTagHandler = unknownTagHandler;
	}

	public static RegisterDevice parseFrom(final byte[] data) throws IOException {
		return parseFields(new InputReader(data, unknownTagHandler));
	}

	public static RegisterDevice parseFrom(final InputStream inputStream) throws IOException {
		return parseFields(new InputReader(inputStream, unknownTagHandler));
	}

	public static RegisterDevice parseDelimitedFrom(final InputStream inputStream) throws IOException {
		final int limit = DelimitedSizeUtil.readDelimitedSize(inputStream);
		return parseFields(new InputReader(new DelimitedInputStream(inputStream, limit), unknownTagHandler));
	}
}