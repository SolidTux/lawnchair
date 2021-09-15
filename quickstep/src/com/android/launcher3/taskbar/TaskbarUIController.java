/*
 * Copyright (C) 2021 The Android Open Source Project
 *
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
 */
package com.android.launcher3.taskbar;

import android.graphics.Rect;

import com.android.launcher3.model.data.ItemInfoWithIcon;
import com.android.launcher3.model.data.WorkspaceItemInfo;

import java.util.stream.Stream;

/**
 * Base class for providing different taskbar UI
 */
public class TaskbarUIController {

    public static final TaskbarUIController DEFAULT = new TaskbarUIController();

    protected void init(TaskbarControllers taskbarControllers) { }

    protected void onDestroy() { }

    protected boolean isTaskbarTouchable() {
        return true;
    }

    protected void updateContentInsets(Rect outContentInsets) { }

    protected void onStashedInAppChanged() { }

    public Stream<ItemInfoWithIcon> getAppIconsForEdu() {
        return Stream.empty();
    }

    public void onTaskbarIconLaunched(WorkspaceItemInfo item) { }
}
