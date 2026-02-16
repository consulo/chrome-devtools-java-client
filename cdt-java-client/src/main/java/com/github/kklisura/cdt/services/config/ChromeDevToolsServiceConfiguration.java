package com.github.kklisura.cdt.services.config;

/*-
 * #%L
 * cdt-java-client
 * %%
 * Copyright (C) 2018 - 2026 Kenan Klisura
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */

import com.github.kklisura.cdt.services.executors.DefaultEventExecutorService;
import com.github.kklisura.cdt.services.executors.EventExecutorService;

/**
 * Chrome DevTools service configuration.
 *
 * @author Kenan Klisura
 */
public class ChromeDevToolsServiceConfiguration {
  /** Read timeout in seconds. Default 60. */
  private long readTimeout = 60;

  private EventExecutorService eventExecutorService;

  /**
   * Gets read timeout in seconds.
   *
   * @return Read timeout in seconds.
   */
  public long getReadTimeout() {
    return readTimeout;
  }

  /**
   * Sets read timeout in seconds. 0 for infinite timeout.
   *
   * @param readTimeout Read timeout in seconds.
   */
  public void setReadTimeout(long readTimeout) {
    this.readTimeout = readTimeout;
  }

  /**
   * Gets event executor service.
   *
   * @return Event executor service.
   */
  public EventExecutorService getEventExecutorService() {
    if (eventExecutorService == null) {
      eventExecutorService = new DefaultEventExecutorService();
    }
    return eventExecutorService;
  }

  /**
   * Sets event executor service.
   *
   * @param eventExecutorService Event executor service.
   */
  public void setEventExecutorService(EventExecutorService eventExecutorService) {
    this.eventExecutorService = eventExecutorService;
  }
}
