/**
 * The MIT License
 * Copyright (c) 2014-2016 Ilkka Sepp�l�
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

package com.iluwatar.commander.messagingservice;

import java.util.Hashtable;
import com.iluwatar.commander.Database;
import com.iluwatar.commander.exceptions.DatabaseUnavailableException;
import com.iluwatar.commander.messagingservice.MessagingService.MessageRequest;

/**
 * The MessagingDatabase is where the MessageRequest is added.
 */

public class MessagingDatabase extends Database<MessageRequest> {
  private Hashtable<String, MessageRequest> data;

  public MessagingDatabase() {
    this.data = new Hashtable<String, MessageRequest>();
  }

  @Override
  public MessageRequest add(MessageRequest r) throws DatabaseUnavailableException {
    return data.put(r.reqId, r);
  }

  @Override
  public MessageRequest get(String rId) throws DatabaseUnavailableException {
    return data.get(rId);
  }

}
