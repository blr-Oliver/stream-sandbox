package by.ctdev.sandbox.stream.boilerplate;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.function.Consumer;

public class StreamStats implements Consumer<Object> {
  private AtomicInteger count = new AtomicInteger(0);
  private AtomicLong start = new AtomicLong(-1L);
  private AtomicLong end = new AtomicLong(-1L);

  @Override
  public void accept(Object item) {
    long now = System.nanoTime();
    count.incrementAndGet();
    start.compareAndSet(-1L, now);
    end.set(now);
  }

  public int getCount() {
    return count.get();
  }

  public Long getStart() {
    long start = this.start.get();
    return start == -1L ? null : start;
  }

  public Long getEnd() {
    long end = this.end.get();
    return end == -1L ? null : end;
  }

  public Long getDuration() {
    Long start = getStart();
    Long end = getEnd();
    return start != null && end != null ? end - start : null;
  }

  public Double getPerformance() {
    Long duration = getDuration();
    return duration == null ? null : (double) getCount() / duration;
  }
}
