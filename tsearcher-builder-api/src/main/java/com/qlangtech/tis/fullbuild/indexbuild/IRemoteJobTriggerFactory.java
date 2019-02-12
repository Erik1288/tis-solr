/* 
 * The MIT License
 *
 * Copyright (c) 2018-2022, qinglangtech Ltd
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package com.qlangtech.tis.fullbuild.indexbuild;

import com.qlangtech.tis.trigger.feedback.DistributeLog;
import com.qlangtech.tis.trigger.jst.ImportDataProcessInfo;

/* *
 * @author 百岁（baisui@qlangtech.com）
 * @date 2019年1月17日
 */
public interface IRemoteJobTriggerFactory {

	//
	/**
	 * 创建build索引任务
	 * 
	 * @param log
	 *            分布式日志收集
	 * @param timePoint
	 *            创建全量构建的时间点，solrcore reload时需要补增量就依赖该时间戳
	 * @param indexName
	 *            solr collection名称
	 * @param username
	 *            系统触发的用户名
	 * @param groupNum
	 *            solrcollection 索引的slice名称
	 * @param state
	 * @param context
	 * @return
	 * @throws Exception
	 */
	public IRemoteJobTrigger createBuildJob(DistributeLog log, String timePoint, String indexName, String username,
			String groupNum, ImportDataProcessInfo state, TaskContext context) throws Exception;

	// 创建dump数据任务
	public IRemoteJobTrigger createDumpJob(String indexName, String starttime, TaskContext context) throws Exception;
}
