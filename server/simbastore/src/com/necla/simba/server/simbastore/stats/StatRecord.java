/*******************************************************************************
 *   Copyright 2015 Dorian Perkins, Younghwan Go, Nitin Agrawal, Akshat Aranya
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
package com.necla.simba.server.simbastore.stats;

public class StatRecord {
	float cassandraReadLatency;
	float cassandraWriteLatency;
	float swiftReadLatency;
	float swiftWriteLatency;
	long cassandraReadBytes;
	long cassandraWriteBytes;
	long swiftReadBytes;
	long swiftWriteBytes;

	public StatRecord() {
		cassandraReadLatency = 0;
		cassandraWriteLatency = 0;
		swiftReadLatency = 0;
		swiftWriteLatency = 0;
		cassandraReadBytes = 0;
		cassandraWriteBytes = 0;
		swiftReadBytes = 0;
		swiftWriteBytes = 0;
	}
};
