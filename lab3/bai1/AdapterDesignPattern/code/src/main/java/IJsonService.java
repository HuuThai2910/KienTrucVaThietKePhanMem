/*
 * @ (#) .java    1.0
 * Copyright (c)  IUH. All rights reserved.
 */

/*
 * @description
 * @author: Huu Thai
 * @date:
 * @version: 1.0
 */
// 1. Target Interface: Đây là giao diện mà Web Service mong muốn sử dụng (JSON)
interface IJsonService {
    void sendRequest(String jsonData);
}