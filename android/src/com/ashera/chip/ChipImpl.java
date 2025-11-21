//start - license
/*
 * Copyright (c) 2025 Ashera Cordova
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 */
//end - license
package com.ashera.chip;
//start - imports

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;

import android.content.Context;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.widget.*;
import androidx.core.view.*;
import android.view.*;
import android.graphics.drawable.*;


import android.os.Build;
import android.view.View;
import android.text.*;

import com.ashera.core.IFragment;
import com.ashera.converter.*;

import android.annotation.SuppressLint;

import com.ashera.layout.*;
import com.ashera.plugin.*;
import com.ashera.widget.bus.*;
import com.ashera.widget.*;
import com.ashera.widget.bus.Event.*;
import com.ashera.widget.IWidgetLifeCycleListener.EventId;
import com.ashera.widget.IWidgetLifeCycleListener.EventId.*;


import static com.ashera.widget.IWidget.*;
//end - imports

import android.content.res.ColorStateList;
import android.text.TextUtils.TruncateAt;		
@SuppressLint("NewApi")
public class ChipImpl extends BaseWidget {
	//start - body
	public final static String LOCAL_NAME = "com.google.android.material.chip.Chip"; 
	public final static String GROUP_NAME = "com.google.android.material.chip.Chip";

	protected com.google.android.material.chip.Chip chip;
	
		@SuppressLint("NewApi")
		final static class TextView_ellipsize  extends AbstractStringToEnumConverter{
		private Map<String, Object> mapping = new HashMap<>();
				{
		
				mapping.put("end", TruncateAt.END);
		
		
				mapping.put("middle", TruncateAt.MIDDLE);
		
		
				mapping.put("none", null);
		
		
				mapping.put("start", TruncateAt.START);
		
				}
		@Override
		public Map<String, Object> getMapping() {
				return mapping;
				}

		@Override
		public Object getDefault() {
				return null;
				}
				}
	
	@Override
	public void loadAttributes(String attributeName) {
		ViewImpl.register(attributeName);


		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("checkable").withType("boolean"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("textAppearance").withType("style"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("checkedIcon").withType("drawable"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("checkedIconTint").withType("colorstate"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("checkedIconVisible").withType("boolean"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("chipBackgroundColor").withType("colorstate"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("chipCornerRadius").withType("dimensionfloat"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("chipEndPadding").withType("dimensionfloat"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("chipIcon").withType("drawable"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("chipIconSize").withType("dimensionfloat"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("chipIconTint").withType("colorstate"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("chipIconVisible").withType("boolean"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("chipMinHeight").withType("dimensionfloat"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("chipStartPadding").withType("dimensionfloat"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("chipStrokeColor").withType("colorstate"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("chipStrokeWidth").withType("dimensionfloat"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("closeIcon").withType("drawable"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("closeIconEndPadding").withType("dimensionfloat"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("closeIconSize").withType("dimensionfloat"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("closeIconStartPadding").withType("dimensionfloat"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("closeIconTint").withType("colorstate"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("closeIconVisible").withType("boolean"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("ensureMinTouchTargetSize").withType("boolean"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("iconEndPadding").withType("dimensionfloat"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("iconStartPadding").withType("dimensionfloat"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("rippleColor").withType("colorstate"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("textEndPadding").withType("dimensionfloat"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("textStartPadding").withType("dimensionfloat"));
		ConverterFactory.register("com.google.android.material.chip.Chip.TextView.ellipsize", new TextView_ellipsize());
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("ellipsize").withType("com.google.android.material.chip.Chip.TextView.ellipsize"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("maxWidth").withType("dimension"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("checked").withType("boolean"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("text").withType("resourcestring"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("onCheckedChange").withType("string"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("onCloseIconClick").withType("string"));
	}
	
	public ChipImpl() {
		super(GROUP_NAME, LOCAL_NAME);
	}
	public  ChipImpl(String localname) {
		super(GROUP_NAME, localname);
	}
	public  ChipImpl(String groupName, String localname) {
		super(groupName, localname);
	}

		
	public class ChipExt extends com.google.android.material.chip.Chip implements ILifeCycleDecorator, com.ashera.widget.IMaxDimension{
		private MeasureEvent measureFinished = new MeasureEvent();
		private OnLayoutEvent onLayoutEvent = new OnLayoutEvent();
		
		public IWidget getWidget() {
			return ChipImpl.this;
		}
		private int mMaxWidth = -1;
		private int mMaxHeight = -1;
		@Override
		public void setMaxWidth(int width) {
			mMaxWidth = width;
		}
		@Override
		public void setMaxHeight(int height) {
			mMaxHeight = height;
		}
		@Override
		public int getMaxWidth() {
			return mMaxWidth;
		}
		@Override
		public int getMaxHeight() {
			return mMaxHeight;
		}

		public ChipExt(Context context, android.util.AttributeSet attrs, int defStyleAttr) {
	        super(context, attrs, defStyleAttr);
	    }

		public ChipExt(Context context) {
			super(context);
			
		}
		
		@Override
		public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {

			if(mMaxWidth > 0) {
	        	widthMeasureSpec = MeasureSpec.makeMeasureSpec(mMaxWidth, MeasureSpec.AT_MOST);
	        }
	        if(mMaxHeight > 0) {
	            heightMeasureSpec = MeasureSpec.makeMeasureSpec(mMaxHeight, MeasureSpec.AT_MOST);

	        }

	        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
			IWidgetLifeCycleListener listener = (IWidgetLifeCycleListener) getListener();
			if (listener != null) {
			    measureFinished.setWidth(getMeasuredWidth());
			    measureFinished.setHeight(getMeasuredHeight());
				listener.eventOccurred(EventId.measureFinished, measureFinished);
			}
		}
		
		@Override
		protected void onLayout(boolean changed, int l, int t, int r, int b) {
			super.onLayout(changed, l, t, r, b);
			
			ViewImpl.nativeMakeFrame(asNativeWidget(), l, t, r, b);
			
			replayBufferedEvents();
			
			IWidgetLifeCycleListener listener = (IWidgetLifeCycleListener) getListener();
			if (listener != null) {
				onLayoutEvent.setB(b);
				onLayoutEvent.setL(l);
				onLayoutEvent.setR(r);
				onLayoutEvent.setT(t);
				onLayoutEvent.setChanged(changed);
				listener.eventOccurred(EventId.onLayout, onLayoutEvent);
			}
			
			if (isInvalidateOnFrameChange() && isInitialised()) {
				ChipImpl.this.invalidate();
			}
		}	
		
		@Override
		public void onDraw(Canvas canvas) {
			Runnable runnable = () -> super.onDraw(canvas);
			executeMethodListeners("onDraw", runnable, canvas);
		}

		@Override
		public void draw(Canvas canvas) {
			Runnable runnable = () -> super.draw(canvas);
			executeMethodListeners("draw", runnable, canvas);
		}

		@SuppressLint("WrongCall")
		@Override
		public void execute(String method, Object... args) {
			switch (method) {
				case "onDraw":
					setOnMethodCalled(true);
					super.onDraw((Canvas) args[0]);
					break;

				case "draw":
					setOnMethodCalled(true);
					super.draw((Canvas) args[0]);
					break;

				default:
					break;
			}
		}

		public void updateMeasuredDimension(int width, int height) {
			setMeasuredDimension(width, height);
		}


		@Override
		public ILifeCycleDecorator newInstance(IWidget widget) {
			throw new UnsupportedOperationException();
		}

		@Override
		public void setAttribute(WidgetAttribute widgetAttribute,
				String strValue, Object objValue) {
			throw new UnsupportedOperationException();
		}		
		

		@Override
		public List<String> getMethods() {
			throw new UnsupportedOperationException();
		}
		
		@Override
		public void initialized() {
			throw new UnsupportedOperationException();
		}
		
        @Override
        public Object getAttribute(WidgetAttribute widgetAttribute) {
            throw new UnsupportedOperationException();
        }
        @Override
        public void drawableStateChanged() {
        	super.drawableStateChanged();
        	if (!isWidgetDisposed()) {
        		ViewImpl.drawableStateChanged(ChipImpl.this);
        	}
        }
        
    	public void setState0(float value) {
    		ViewImpl.setState(ChipImpl.this, 0, value);
    	}
    	public void setState0(int value) {
    		ViewImpl.setState(ChipImpl.this, 0, value);
    	}
    	public void setState0(double value) {
    		ViewImpl.setState(ChipImpl.this, 0, value);
    	}
    	
    	public void setState0(Float value) {
    		ViewImpl.setState(ChipImpl.this, 0, value);
    	}
    	public void setState0(Integer value) {
    		ViewImpl.setState(ChipImpl.this, 0, value);
    	}
    	public void setState0(Double value) {
    		ViewImpl.setState(ChipImpl.this, 0, value);
    	}
    	public void setState0(Object value) {
    		ViewImpl.setState(ChipImpl.this, 0, value);
    	}
    	public void setState1(float value) {
    		ViewImpl.setState(ChipImpl.this, 1, value);
    	}
    	public void setState1(int value) {
    		ViewImpl.setState(ChipImpl.this, 1, value);
    	}
    	public void setState1(double value) {
    		ViewImpl.setState(ChipImpl.this, 1, value);
    	}
    	
    	public void setState1(Float value) {
    		ViewImpl.setState(ChipImpl.this, 1, value);
    	}
    	public void setState1(Integer value) {
    		ViewImpl.setState(ChipImpl.this, 1, value);
    	}
    	public void setState1(Double value) {
    		ViewImpl.setState(ChipImpl.this, 1, value);
    	}
    	public void setState1(Object value) {
    		ViewImpl.setState(ChipImpl.this, 1, value);
    	}
    	public void setState2(float value) {
    		ViewImpl.setState(ChipImpl.this, 2, value);
    	}
    	public void setState2(int value) {
    		ViewImpl.setState(ChipImpl.this, 2, value);
    	}
    	public void setState2(double value) {
    		ViewImpl.setState(ChipImpl.this, 2, value);
    	}
    	
    	public void setState2(Float value) {
    		ViewImpl.setState(ChipImpl.this, 2, value);
    	}
    	public void setState2(Integer value) {
    		ViewImpl.setState(ChipImpl.this, 2, value);
    	}
    	public void setState2(Double value) {
    		ViewImpl.setState(ChipImpl.this, 2, value);
    	}
    	public void setState2(Object value) {
    		ViewImpl.setState(ChipImpl.this, 2, value);
    	}
    	public void setState3(float value) {
    		ViewImpl.setState(ChipImpl.this, 3, value);
    	}
    	public void setState3(int value) {
    		ViewImpl.setState(ChipImpl.this, 3, value);
    	}
    	public void setState3(double value) {
    		ViewImpl.setState(ChipImpl.this, 3, value);
    	}
    	
    	public void setState3(Float value) {
    		ViewImpl.setState(ChipImpl.this, 3, value);
    	}
    	public void setState3(Integer value) {
    		ViewImpl.setState(ChipImpl.this, 3, value);
    	}
    	public void setState3(Double value) {
    		ViewImpl.setState(ChipImpl.this, 3, value);
    	}
    	public void setState3(Object value) {
    		ViewImpl.setState(ChipImpl.this, 3, value);
    	}
    	public void setState4(float value) {
    		ViewImpl.setState(ChipImpl.this, 4, value);
    	}
    	public void setState4(int value) {
    		ViewImpl.setState(ChipImpl.this, 4, value);
    	}
    	public void setState4(double value) {
    		ViewImpl.setState(ChipImpl.this, 4, value);
    	}
    	
    	public void setState4(Float value) {
    		ViewImpl.setState(ChipImpl.this, 4, value);
    	}
    	public void setState4(Integer value) {
    		ViewImpl.setState(ChipImpl.this, 4, value);
    	}
    	public void setState4(Double value) {
    		ViewImpl.setState(ChipImpl.this, 4, value);
    	}
    	public void setState4(Object value) {
    		ViewImpl.setState(ChipImpl.this, 4, value);
    	}
        	public void state0() {
        		ViewImpl.state(ChipImpl.this, 0);
        	}
        	public void state1() {
        		ViewImpl.state(ChipImpl.this, 1);
        	}
        	public void state2() {
        		ViewImpl.state(ChipImpl.this, 2);
        	}
        	public void state3() {
        		ViewImpl.state(ChipImpl.this, 3);
        	}
        	public void state4() {
        		ViewImpl.state(ChipImpl.this, 4);
        	}
                        
        public void stateYes() {
        	ViewImpl.stateYes(ChipImpl.this);
        	
        }
        
        public void stateNo() {
        	ViewImpl.stateNo(ChipImpl.this);
        }
     
	
	}	@Override
	public Class getViewClass() {
		return ChipExt.class;
	}

	@Override
	public IWidget newInstance() {
		return new ChipImpl(groupName, localName);
	}
	
	@SuppressLint("NewApi")
	@Override
	public void create(IFragment fragment, Map<String, Object> params) {
		super.create(fragment, params);
Context context = (Context) fragment.getRootActivity();
	Object systemStyle = params.get("systemStyle");
	Object systemAndroidAttrStyle = params.get("systemAndroidAttrStyle");
	
	if (systemStyle == null && systemAndroidAttrStyle == null) {
		chip = new ChipExt(context);
	} else {
		int defStyleAttr = 0;
		int defStyleRes = 0;
		
		if (systemStyle != null) {
			defStyleRes = context.getResources().getIdentifier((String) systemStyle, "style", context.getPackageName());	
		}
		
		if (systemAndroidAttrStyle != null) {
			defStyleAttr = context.getResources().getIdentifier((String) systemAndroidAttrStyle, "attr", "android");	
		}
		
		if (defStyleRes == 0) {
			chip = new ChipExt(context, null, defStyleAttr);	
		} else {
		}
		
	}

		nativeCreate(params);	
		ViewImpl.registerCommandConveter(this);
	}

	@Override
	@SuppressLint("NewApi")
	public void setAttribute(WidgetAttribute key, String strValue, Object objValue, ILifeCycleDecorator decorator) {
		Object nativeWidget = asNativeWidget();
		ViewImpl.setAttribute(this,  key, strValue, objValue, decorator);
		
		switch (key.getAttributeName()) {
			case "checkable": {
				


	chip.setCheckable((boolean)objValue);



			}
			break;
			case "textAppearance": {
				


	chip.setTextAppearanceResource((int)objValue);



			}
			break;
			case "checkedIcon": {
				


	chip.setCheckedIcon((Drawable)objValue);



			}
			break;
			case "checkedIconTint": {
				


	chip.setCheckedIconTint((ColorStateList)objValue);



			}
			break;
			case "checkedIconVisible": {
				


	chip.setCheckedIconVisible((boolean)objValue);



			}
			break;
			case "chipBackgroundColor": {
				


	chip.setChipBackgroundColor((ColorStateList)objValue);



			}
			break;
			case "chipCornerRadius": {
				


	chip.setChipCornerRadius((float)objValue);



			}
			break;
			case "chipEndPadding": {
				


	chip.setChipEndPadding((float)objValue);



			}
			break;
			case "chipIcon": {
				


	chip.setChipIcon((Drawable)objValue);



			}
			break;
			case "chipIconSize": {
				


	chip.setChipIconSize((float)objValue);



			}
			break;
			case "chipIconTint": {
				


	chip.setChipIconTint((ColorStateList)objValue);



			}
			break;
			case "chipIconVisible": {
				


	chip.setChipIconVisible((boolean)objValue);



			}
			break;
			case "chipMinHeight": {
				


	chip.setChipMinHeight((float)objValue);



			}
			break;
			case "chipStartPadding": {
				


	chip.setChipStartPadding((float)objValue);



			}
			break;
			case "chipStrokeColor": {
				


	chip.setChipStrokeColor((ColorStateList)objValue);



			}
			break;
			case "chipStrokeWidth": {
				


	chip.setChipStrokeWidth((float)objValue);



			}
			break;
			case "closeIcon": {
				


	chip.setCloseIcon((Drawable)objValue);



			}
			break;
			case "closeIconEndPadding": {
				


	chip.setCloseIconEndPadding((float)objValue);



			}
			break;
			case "closeIconSize": {
				


	chip.setCloseIconSize((float)objValue);



			}
			break;
			case "closeIconStartPadding": {
				


	chip.setCloseIconStartPadding((float)objValue);



			}
			break;
			case "closeIconTint": {
				


	chip.setCloseIconTint((ColorStateList)objValue);



			}
			break;
			case "closeIconVisible": {
				


	chip.setCloseIconVisible((boolean)objValue);



			}
			break;
			case "ensureMinTouchTargetSize": {
				


	chip.setEnsureMinTouchTargetSize((boolean)objValue);



			}
			break;
			case "iconEndPadding": {
				


	chip.setIconEndPadding((float)objValue);



			}
			break;
			case "iconStartPadding": {
				


	chip.setIconStartPadding((float)objValue);



			}
			break;
			case "rippleColor": {
				


	chip.setRippleColor((ColorStateList)objValue);



			}
			break;
			case "textEndPadding": {
				


	chip.setTextEndPadding((float)objValue);



			}
			break;
			case "textStartPadding": {
				


	chip.setTextStartPadding((float)objValue);



			}
			break;
			case "ellipsize": {
				


	chip.setEllipsize((TruncateAt)objValue);



			}
			break;
			case "maxWidth": {
				


	chip.setMaxWidth((int)objValue);



			}
			break;
			case "checked": {
				


	chip.setChecked((boolean)objValue);



			}
			break;
			case "text": {
				


	chip.setText((String)objValue);



			}
			break;
			case "onCheckedChange": {
				


		setOnChecked(objValue);



			}
			break;
			case "onCloseIconClick": {
				


		 setOnClick(objValue);



			}
			break;
		default:
			break;
		}
		
	}
	
	@Override
	@SuppressLint("NewApi")
	public Object getAttribute(WidgetAttribute key, ILifeCycleDecorator decorator) {
		Object nativeWidget = asNativeWidget();
		Object attributeValue = ViewImpl.getAttribute(this, nativeWidget, key, decorator);
		if (attributeValue != null) {
			return attributeValue;
		}
		switch (key.getAttributeName()) {
			case "checkedIcon": {
return chip.getCheckedIcon();				}
			case "checkedIconTint": {
return chip.getCheckedIconTint();				}
			case "chipBackgroundColor": {
return chip.getChipBackgroundColor();				}
			case "chipCornerRadius": {
return chip.getChipCornerRadius();				}
			case "chipEndPadding": {
return chip.getChipEndPadding();				}
			case "chipIcon": {
return chip.getChipIcon();				}
			case "chipIconTint": {
return chip.getChipIconTint();				}
			case "chipMinHeight": {
return chip.getChipMinHeight();				}
			case "chipStartPadding": {
return chip.getChipStartPadding();				}
			case "chipStrokeColor": {
return chip.getChipStrokeColor();				}
			case "chipStrokeWidth": {
return chip.getChipStrokeWidth();				}
			case "closeIcon": {
return chip.getCloseIcon();				}
			case "closeIconEndPadding": {
return chip.getCloseIconEndPadding();				}
			case "closeIconSize": {
return chip.getCloseIconSize();				}
			case "closeIconStartPadding": {
return chip.getCloseIconStartPadding();				}
			case "closeIconTint": {
return chip.getCloseIconTint();				}
			case "ensureMinTouchTargetSize": {
return chip.shouldEnsureMinTouchTargetSize();				}
			case "iconEndPadding": {
return chip.getIconEndPadding();				}
			case "iconStartPadding": {
return chip.getIconStartPadding();				}
			case "rippleColor": {
return chip.getRippleColor();				}
			case "textEndPadding": {
return chip.getTextEndPadding();				}
			case "textStartPadding": {
return chip.getTextStartPadding();				}
		}
		
		return null;
	}
	
	@Override
	public Object asWidget() {
		return chip;
	}

	
	@SuppressLint("NewApi")
private static class OnCheckedChangeListener implements CompoundButton.OnCheckedChangeListener, com.ashera.widget.IListener{
private IWidget w; private View view; private String strValue; private String action;
public String getAction() {return action;}
public OnCheckedChangeListener(IWidget w, String strValue)  {
this.w = w; this.strValue = strValue;
}
public OnCheckedChangeListener(IWidget w, String strValue, String action)  {
this.w = w; this.strValue = strValue;this.action=action;
}
public void onCheckedChanged (CompoundButton buttonView, 
                boolean isChecked){
    
	if (action == null || action.equals("onCheckedChange")) {
		// populate the data from ui to pojo
		w.syncModelFromUiToPojo("onCheckedChange");
	    java.util.Map<String, Object> obj = getOnCheckedChangeEventObj(buttonView,isChecked);
	    String commandName =  (String) obj.get(EventExpressionParser.KEY_COMMAND_NAME);
	    
	    // execute command based on command type
	    String commandType = (String)obj.get(EventExpressionParser.KEY_COMMAND_TYPE);
		switch (commandType) {
		case "+":
		    if (EventCommandFactory.hasCommand(commandName)) {
		    	 EventCommandFactory.getCommand(commandName).executeCommand(w, obj, buttonView,isChecked);
		    }

			break;
		default:
			break;
		}
		
		if (obj.containsKey("refreshUiFromModel")) {
			Object widgets = obj.remove("refreshUiFromModel");
			com.ashera.layout.ViewImpl.refreshUiFromModel(w, widgets, true);
		}
		if (w.getModelUiToPojoEventIds() != null) {
			com.ashera.layout.ViewImpl.refreshUiFromModel(w, w.getModelUiToPojoEventIds(), true);
		}
		if (strValue != null && !strValue.isEmpty() && !strValue.trim().startsWith("+")) {
		    com.ashera.core.IActivity activity = (com.ashera.core.IActivity)w.getFragment().getRootActivity();
		    if (activity != null) {
		    	activity.sendEventMessage(obj);
		    }
		}
	}
    return;
}//#####

public java.util.Map<String, Object> getOnCheckedChangeEventObj(CompoundButton buttonView,boolean isChecked) {
	java.util.Map<String, Object> obj = com.ashera.widget.PluginInvoker.getJSONCompatMap();
    obj.put("action", "action");
    obj.put("eventType", "checkedchange");
    obj.put("fragmentId", w.getFragment().getFragmentId());
    obj.put("actionUrl", w.getFragment().getActionUrl());
    obj.put("namespace", w.getFragment().getNamespace());
    
    if (w.getComponentId() != null) {
    	obj.put("componentId", w.getComponentId());
    }
    
    PluginInvoker.putJSONSafeObjectIntoMap(obj, "id", w.getId());
     
        PluginInvoker.putJSONSafeObjectIntoMap(obj, "isChecked", isChecked);
    
    // parse event info into the map
    EventExpressionParser.parseEventExpression(strValue, obj);
    
    // update model data into map
    w.updateModelToEventMap(obj, "onCheckedChange", (String)obj.get(EventExpressionParser.KEY_EVENT_ARGS));
    return obj;
}
}

	@SuppressLint("NewApi")
private static class OnClickListener implements View.OnClickListener, com.ashera.widget.IListener{
private IWidget w; private View view; private String strValue; private String action;
public String getAction() {return action;}
public OnClickListener(IWidget w, String strValue)  {
this.w = w; this.strValue = strValue;
}
public OnClickListener(IWidget w, String strValue, String action)  {
this.w = w; this.strValue = strValue;this.action=action;
}
public void onClick (View v){
    
	if (action == null || action.equals("onClick")) {
		// populate the data from ui to pojo
		w.syncModelFromUiToPojo("onClick");
	    java.util.Map<String, Object> obj = getOnClickEventObj(v);
	    String commandName =  (String) obj.get(EventExpressionParser.KEY_COMMAND_NAME);
	    
	    // execute command based on command type
	    String commandType = (String)obj.get(EventExpressionParser.KEY_COMMAND_TYPE);
		switch (commandType) {
		case "+":
		    if (EventCommandFactory.hasCommand(commandName)) {
		    	 EventCommandFactory.getCommand(commandName).executeCommand(w, obj, v);
		    }

			break;
		default:
			break;
		}
		
		if (obj.containsKey("refreshUiFromModel")) {
			Object widgets = obj.remove("refreshUiFromModel");
			com.ashera.layout.ViewImpl.refreshUiFromModel(w, widgets, true);
		}
		if (w.getModelUiToPojoEventIds() != null) {
			com.ashera.layout.ViewImpl.refreshUiFromModel(w, w.getModelUiToPojoEventIds(), true);
		}
		if (strValue != null && !strValue.isEmpty() && !strValue.trim().startsWith("+")) {
		    com.ashera.core.IActivity activity = (com.ashera.core.IActivity)w.getFragment().getRootActivity();
		    if (activity != null) {
		    	activity.sendEventMessage(obj);
		    }
		}
	}
    return;
}//#####

public java.util.Map<String, Object> getOnClickEventObj(View v) {
	java.util.Map<String, Object> obj = com.ashera.widget.PluginInvoker.getJSONCompatMap();
    obj.put("action", "action");
    obj.put("eventType", "click");
    obj.put("fragmentId", w.getFragment().getFragmentId());
    obj.put("actionUrl", w.getFragment().getActionUrl());
    obj.put("namespace", w.getFragment().getNamespace());
    
    if (w.getComponentId() != null) {
    	obj.put("componentId", w.getComponentId());
    }
    
    PluginInvoker.putJSONSafeObjectIntoMap(obj, "id", w.getId());
     
    
    // parse event info into the map
    EventExpressionParser.parseEventExpression(strValue, obj);
    
    // update model data into map
    w.updateModelToEventMap(obj, "onClick", (String)obj.get(EventExpressionParser.KEY_EVENT_ARGS));
    return obj;
}
}

	
	    @Override
	    public Object asNativeWidget() {
	        return chip;
	    }

	    private void nativeCreate(Map<String, Object> params) {
	    }
	@Override
	public void setId(String id){
		if (id != null && !id.equals("")){
			super.setId(id);
			chip.setId((int) quickConvert(id, "id"));
		}
	}
	
 
    @Override
    public void requestLayout() {
    	if (isInitialised()) {
    		ViewImpl.requestLayout(this, asNativeWidget());
    		
    	}
    }
    
    @Override
    public void invalidate() {
    	if (isInitialised()) {
			ViewImpl.invalidate(this, asNativeWidget());

    	}
    }

	
		//end - body

	//start - codecopy
	private void setOnClick(Object objValue) {
		if (objValue instanceof String) {
			chip.setOnCloseIconClickListener(new OnClickListener(this, (String) objValue));
		} else {
			chip.setOnCloseIconClickListener((View.OnClickListener) objValue);
		}
		
	}

	private void setOnChecked(Object objValue) {
		if (objValue instanceof String) {
			chip.setOnCheckedChangeListener(new OnCheckedChangeListener(this, (String) objValue));
		} else {
			chip.setOnCheckedChangeListener((CompoundButton.OnCheckedChangeListener) objValue);
		}
		
	}
	//end - codecopy
}
