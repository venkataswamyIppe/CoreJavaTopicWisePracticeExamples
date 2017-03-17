# CoreJavaTopicWisePracticeExamples

# Java Applets

Applet is java programming run on browser whose results sharble across the universe.

Advantages of Applets

1.Very less response time as it works on the client side.
2.Can be run using any browser, which has JVM running in it.

It provides 4 life cycle methods of applet.

public void init(): is used to initialized the Applet. It is invoked only once.
public void start(): is invoked after the init() method or browser is maximized. It is used to start the Applet.
public void stop(): is used to stop the Applet. It is invoked when Applet is stop or browser is minimized.
public void destroy(): is used to destroy the Applet. It is invoked only once.

# Java Applets Execution
c:\>javac First.java
c:\>appletviewer First.java

