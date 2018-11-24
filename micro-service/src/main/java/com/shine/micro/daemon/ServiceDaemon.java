package com.shine.micro.daemon;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.daemon.Daemon;
import org.apache.commons.daemon.DaemonContext;
import org.apache.commons.daemon.DaemonInitException;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

@Slf4j
public class ServiceDaemon implements Daemon {

	private ConfigurableApplicationContext ctx;

	@Override
	public void init(DaemonContext context) throws DaemonInitException, Exception {
		initLogging(null);
		ctx = new ClassPathXmlApplicationContext(getContextFilename(context.getArguments()));
		ctx.registerShutdownHook();
		log.debug("容器启动完毕！");
	}

	public static void initLogging(String logFilePath) throws FileNotFoundException {
//		String logLocation = System.getProperty("log4j.configurationFile");
//		if (StringUtils.isNotBlank(logLocation))
//			Configurator.initialize("log4j2", logLocation);
//		else {
//			if (logFilePath == null)
////				Configurator.initialize("log4j2", "classpath:alone/log4j2.xml");
//			else
////				Configurator.initialize("log4j2", logFilePath);
//		}
//		logger = LoggerFactory.getLogger(ServiceDaemon.class);
	}

	@Override
	public void start() throws Exception {
	}

	@Override
	public void stop() throws Exception {
	}

	@Override
	public void destroy() {
		ctx.close();
	}

	/**
	 * 这样可以直接跑，要关闭就杀掉进程
	 *
	 * @param args
	 * @throws FileNotFoundException
	 */
	public static void main(String[] args) throws FileNotFoundException {
		initLogging(null);
		@SuppressWarnings("resource")
		ConfigurableApplicationContext ctx = new ClassPathXmlApplicationContext(getContextFilename(args));
		ctx.registerShutdownHook();
		log.debug("容器启动完毕！");
		try {
			Thread.sleep(50000000);
		} catch (InterruptedException e) {
			e.printStackTrace();

		}
	}

	public static String[] getContextFilename(String args[]) {
		List<String> list = new ArrayList<String>();
		list.add("classpath*:spring/*-context.xml");
		return list.toArray(new String[list.size()]);
	}
}
