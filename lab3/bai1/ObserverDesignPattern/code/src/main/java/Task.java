/*
 * @ (#) .java    1.0
 * Copyright (c)  IUH. All rights reserved.
 */

import java.util.ArrayList;
import java.util.List;

/*
 * @description
 * @author: Huu Thai
 * @date:
 * @version: 1.0
 */
class Task implements Subject {
    private List<Observer> observers = new ArrayList<>();
    private String taskName;
    private String status;

    public Task(String taskName, String status) {
        this.taskName = taskName;
        this.status = status;
    }

    public void setStatus(String newStatus) {
        this.status = newStatus;
        // Bất cứ khi nào trạng thái thay đổi, tự động thông báo
        notifyObservers();
    }

    @Override
    public void attach(Observer o) {
        observers.add(o);
    }

    @Override
    public void detach(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        for (Observer o : observers) {
            o.update("PROJECT UPDATE: Task '" + taskName + "' đã chuyển sang trạng thái: " + status);
        }
    }
}
