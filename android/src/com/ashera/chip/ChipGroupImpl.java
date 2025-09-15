package com.ashera.chip;
// start - imports
import java.util.*;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Build;
import android.view.*;
import android.widget.*;
import android.view.View.*;

import com.ashera.widget.BaseHasWidgets;

import android.annotation.SuppressLint;

import com.ashera.core.IFragment;
import com.ashera.widget.bus.*;
import com.ashera.converter.*;
import com.ashera.widget.bus.Event.*;
import com.ashera.widget.*;
import com.ashera.widget.IWidgetLifeCycleListener.*;
import com.ashera.layout.*;

import android.graphics.Canvas;
import android.widget.*;
import androidx.core.view.*;
import android.view.*;

import static com.ashera.widget.IWidget.*;
//end - imports

import com.google.android.material.chip.ChipGroup;
public class ChipGroupImpl extends BaseHasWidgets {
	//start - body
	public final static String LOCAL_NAME = "com.google.android.material.chip.ChipGroup"; 
	public final static String GROUP_NAME = "com.google.android.material.chip.ChipGroup";
	private com.google.android.material.chip.ChipGroup chipGroup;
	

	
	@Override
	public void loadAttributes(String localName) {
		ViewGroupImpl.register(localName);

		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("checkedChip").withType("id"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("uncheckedChip").withType("id"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("clearCheck").withType("nil"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("checkMultiple").withType("array").withArrayType("id").withArrayListToFinalType("listtointarray"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("selectionRequired").withType("boolean"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("onCheckedStateChange").withType("string"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("chipSpacing").withType("dimension"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("chipSpacingHorizontal").withType("dimension"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("chipSpacingVertical").withType("dimension"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("singleLine").withType("boolean"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("singleSelection").withType("boolean"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("addChip").withType("object"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("removeChip").withType("string"));
	
	}
	
	public ChipGroupImpl() {
		super(GROUP_NAME, LOCAL_NAME);
	}
	public  ChipGroupImpl(String localname) {
		super(GROUP_NAME, localname);
	}
	public  ChipGroupImpl(String groupName, String localname) {
		super(groupName, localname);
	}

	@Override
	public IWidget newInstance() {
		return new ChipGroupImpl(groupName, localName);
	}
	
	@SuppressLint("NewApi")
	@Override
	public void create(IFragment fragment, Map<String, Object> params) {
		super.create(fragment, params);
Context context = (Context) fragment.getRootActivity();
	Object systemStyle = params.get("systemStyle");
	Object systemAndroidAttrStyle = params.get("systemAndroidAttrStyle");
	
	if (systemStyle == null && systemAndroidAttrStyle == null) {
		chipGroup = new ChipGroupExt(context);
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
			chipGroup = new ChipGroupExt(context, null, defStyleAttr);	
		} else {
		}
		
	}

		
		nativeCreate(params);
		
		
		ViewGroupImpl.registerCommandConveter(this);

	}

	@Override
	public Object asWidget() {
		return chipGroup;
	}

	@Override
	public boolean remove(IWidget w) {
		boolean remove = super.remove(w);
		chipGroup.removeView((View) w.asWidget());
		return remove;
	}
	
	@Override
    public boolean remove(int index) {
		IWidget widget = widgets.get(index);
        boolean remove = super.remove(index);

        if (index + 1 <= chipGroup.getChildCount()) {
            chipGroup.removeViewAt(index);
        }    
        return remove;
    }

	
	@Override
	public void add(IWidget w, int index) {
		if (index != -2) {
			View view = (View) w.asWidget();
			createLayoutParams(view);
			    if (index == -1) {
			        chipGroup.addView(view);
			    } else {
			        chipGroup.addView(view, index);
			    }
		}
		
		ViewGroupImpl.nativeAddView(asNativeWidget(), w.asNativeWidget());
		super.add(w, index);
	}
	
	private void createLayoutParams(View view) {
		com.google.android.material.chip.ChipGroup.LayoutParams layoutParams = (com.google.android.material.chip.ChipGroup.LayoutParams) view.getLayoutParams();
		
		layoutParams = (com.google.android.material.chip.ChipGroup.LayoutParams) view.getLayoutParams();
		if (layoutParams == null) {
			layoutParams = new com.google.android.material.chip.ChipGroup.LayoutParams(-2, -2);
			view.setLayoutParams(layoutParams);
		}  else {
			layoutParams.height = -2;
			layoutParams.width = -2;
		}
	}
	
	private com.google.android.material.chip.ChipGroup.LayoutParams getLayoutParams(View view) {
		return (com.google.android.material.chip.ChipGroup.LayoutParams) view.getLayoutParams();		
	}
	
	@SuppressLint("NewApi")
	@Override
	public void setChildAttribute(IWidget w, WidgetAttribute key, String strValue, Object objValue) {
		View view = (View) w.asWidget();
		com.google.android.material.chip.ChipGroup.LayoutParams layoutParams = getLayoutParams(view);
		ViewGroupImpl.setChildAttribute(w, key, objValue, layoutParams);		
		
		switch (key.getAttributeName()) {
		case "layout_width":
			layoutParams.width = (int) objValue;
			break;	
		case "layout_height":
			layoutParams.height = (int) objValue;
			break;
		default:
			break;
		}
		
		
		view.setLayoutParams(layoutParams);		
	}
	
	@SuppressLint("NewApi")
	@Override
	public Object getChildAttribute(IWidget w, WidgetAttribute key) {
		Object attributeValue = ViewGroupImpl.getChildAttribute(w, key);		
		if (attributeValue != null) {
			return attributeValue;
		}
		View view = (View) w.asWidget();
		com.google.android.material.chip.ChipGroup.LayoutParams layoutParams = getLayoutParams(view);

		switch (key.getAttributeName()) {
		case "layout_width":
			return layoutParams.width;
		case "layout_height":
			return layoutParams.height;
		}
		
		return null;

	}
	
		
	public class ChipGroupExt extends com.google.android.material.chip.ChipGroup implements ILifeCycleDecorator, com.ashera.widget.IMaxDimension{
		private MeasureEvent measureFinished = new MeasureEvent();
		private OnLayoutEvent onLayoutEvent = new OnLayoutEvent();
		
		public IWidget getWidget() {
			return ChipGroupImpl.this;
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

		public ChipGroupExt(Context context, android.util.AttributeSet attrs, int defStyleAttr) {
	        super(context, attrs, defStyleAttr);
	    }

		public ChipGroupExt(Context context) {
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
				ChipGroupImpl.this.invalidate();
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
        		ViewImpl.drawableStateChanged(ChipGroupImpl.this);
        	}
        }
        
    	public void setState0(float value) {
    		ViewImpl.setState(ChipGroupImpl.this, 0, value);
    	}
    	public void setState0(int value) {
    		ViewImpl.setState(ChipGroupImpl.this, 0, value);
    	}
    	public void setState0(double value) {
    		ViewImpl.setState(ChipGroupImpl.this, 0, value);
    	}
    	
    	public void setState0(Float value) {
    		ViewImpl.setState(ChipGroupImpl.this, 0, value);
    	}
    	public void setState0(Integer value) {
    		ViewImpl.setState(ChipGroupImpl.this, 0, value);
    	}
    	public void setState0(Double value) {
    		ViewImpl.setState(ChipGroupImpl.this, 0, value);
    	}
    	public void setState0(Object value) {
    		ViewImpl.setState(ChipGroupImpl.this, 0, value);
    	}
    	public void setState1(float value) {
    		ViewImpl.setState(ChipGroupImpl.this, 1, value);
    	}
    	public void setState1(int value) {
    		ViewImpl.setState(ChipGroupImpl.this, 1, value);
    	}
    	public void setState1(double value) {
    		ViewImpl.setState(ChipGroupImpl.this, 1, value);
    	}
    	
    	public void setState1(Float value) {
    		ViewImpl.setState(ChipGroupImpl.this, 1, value);
    	}
    	public void setState1(Integer value) {
    		ViewImpl.setState(ChipGroupImpl.this, 1, value);
    	}
    	public void setState1(Double value) {
    		ViewImpl.setState(ChipGroupImpl.this, 1, value);
    	}
    	public void setState1(Object value) {
    		ViewImpl.setState(ChipGroupImpl.this, 1, value);
    	}
    	public void setState2(float value) {
    		ViewImpl.setState(ChipGroupImpl.this, 2, value);
    	}
    	public void setState2(int value) {
    		ViewImpl.setState(ChipGroupImpl.this, 2, value);
    	}
    	public void setState2(double value) {
    		ViewImpl.setState(ChipGroupImpl.this, 2, value);
    	}
    	
    	public void setState2(Float value) {
    		ViewImpl.setState(ChipGroupImpl.this, 2, value);
    	}
    	public void setState2(Integer value) {
    		ViewImpl.setState(ChipGroupImpl.this, 2, value);
    	}
    	public void setState2(Double value) {
    		ViewImpl.setState(ChipGroupImpl.this, 2, value);
    	}
    	public void setState2(Object value) {
    		ViewImpl.setState(ChipGroupImpl.this, 2, value);
    	}
    	public void setState3(float value) {
    		ViewImpl.setState(ChipGroupImpl.this, 3, value);
    	}
    	public void setState3(int value) {
    		ViewImpl.setState(ChipGroupImpl.this, 3, value);
    	}
    	public void setState3(double value) {
    		ViewImpl.setState(ChipGroupImpl.this, 3, value);
    	}
    	
    	public void setState3(Float value) {
    		ViewImpl.setState(ChipGroupImpl.this, 3, value);
    	}
    	public void setState3(Integer value) {
    		ViewImpl.setState(ChipGroupImpl.this, 3, value);
    	}
    	public void setState3(Double value) {
    		ViewImpl.setState(ChipGroupImpl.this, 3, value);
    	}
    	public void setState3(Object value) {
    		ViewImpl.setState(ChipGroupImpl.this, 3, value);
    	}
    	public void setState4(float value) {
    		ViewImpl.setState(ChipGroupImpl.this, 4, value);
    	}
    	public void setState4(int value) {
    		ViewImpl.setState(ChipGroupImpl.this, 4, value);
    	}
    	public void setState4(double value) {
    		ViewImpl.setState(ChipGroupImpl.this, 4, value);
    	}
    	
    	public void setState4(Float value) {
    		ViewImpl.setState(ChipGroupImpl.this, 4, value);
    	}
    	public void setState4(Integer value) {
    		ViewImpl.setState(ChipGroupImpl.this, 4, value);
    	}
    	public void setState4(Double value) {
    		ViewImpl.setState(ChipGroupImpl.this, 4, value);
    	}
    	public void setState4(Object value) {
    		ViewImpl.setState(ChipGroupImpl.this, 4, value);
    	}
        	public void state0() {
        		ViewImpl.state(ChipGroupImpl.this, 0);
        	}
        	public void state1() {
        		ViewImpl.state(ChipGroupImpl.this, 1);
        	}
        	public void state2() {
        		ViewImpl.state(ChipGroupImpl.this, 2);
        	}
        	public void state3() {
        		ViewImpl.state(ChipGroupImpl.this, 3);
        	}
        	public void state4() {
        		ViewImpl.state(ChipGroupImpl.this, 4);
        	}
                        
        public void stateYes() {
        	ViewImpl.stateYes(ChipGroupImpl.this);
        	
        }
        
        public void stateNo() {
        	ViewImpl.stateNo(ChipGroupImpl.this);
        }
     
	
	}
	@Override
	public Class getViewClass() {
		return ChipGroupExt.class;
	}
	
	@SuppressLint("NewApi")
	@Override
	public void setAttribute(WidgetAttribute key, String strValue, Object objValue, ILifeCycleDecorator decorator) {
				ViewGroupImpl.setAttribute(this,  key, strValue, objValue, decorator);
		Object nativeWidget = asNativeWidget();
		switch (key.getAttributeName()) {
			case "checkedChip": {


	chipGroup.check((int)objValue);



			}
			break;
			case "uncheckedChip": {


		uncheck(objValue);



			}
			break;
			case "clearCheck": {


		clearCheck();



			}
			break;
			case "checkMultiple": {


		checkMultiple(objValue);



			}
			break;
			case "selectionRequired": {


	chipGroup.setSelectionRequired((boolean)objValue);



			}
			break;
			case "onCheckedStateChange": {


		setOnCheckedStateChange(objValue);



			}
			break;
			case "chipSpacing": {


	chipGroup.setChipSpacing((int)objValue);



			}
			break;
			case "chipSpacingHorizontal": {


	chipGroup.setChipSpacingHorizontal((int)objValue);



			}
			break;
			case "chipSpacingVertical": {


	chipGroup.setChipSpacingVertical((int)objValue);



			}
			break;
			case "singleLine": {


	chipGroup.setSingleLine((boolean)objValue);



			}
			break;
			case "singleSelection": {


	chipGroup.setSingleSelection((boolean)objValue);



			}
			break;
			case "addChip": {
		if (objValue instanceof Map) {
			Map<String, Object> data = ((Map<String, Object>) objValue);
		Object chipId = quickConvert(data.get("chipId"), "string");
		Object text = quickConvert(data.get("text"), "resourcestring");
		Object chipParams = quickConvert(data.get("chipParams"), "resourcestring");


		 addChip(chipId, text, chipParams);


}
if (objValue instanceof java.util.List) {
	java.util.List<Object> list = (java.util.List<Object>) objValue;
	for (Object object : list) {
		Map<String, Object> data = PluginInvoker.getMap(object);
		Object chipId = quickConvert(data.get("chipId"), "string");
		Object text = quickConvert(data.get("text"), "resourcestring");
		Object chipParams = quickConvert(data.get("chipParams"), "resourcestring");


		 addChip(chipId, text, chipParams);


	}
}
			}
			break;
			case "removeChip": {


		 removeChip(objValue);



			}
			break;
		default:
			break;
		}
		
	}
	
	@Override
	@SuppressLint("NewApi")
	public Object getAttribute(WidgetAttribute key, ILifeCycleDecorator decorator) {
		Object attributeValue = ViewGroupImpl.getAttribute(this, key, decorator);
		if (attributeValue != null) {
			return attributeValue;
		}
		Object nativeWidget = asNativeWidget();
		switch (key.getAttributeName()) {
			case "checkedChip": {
return chipGroup.getCheckedChipId();			}
			case "checkMultiple": {
return chipGroup.getCheckedChipIds();			}
		}
		return null;
	}


	@Override
    public Object asNativeWidget() {
        return chipGroup;
    }
    private void nativeCreate(Map<String, Object> params) {
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
    
	
	@SuppressLint("NewApi")
private static class OnCheckedStateChangeListener implements ChipGroup.OnCheckedStateChangeListener, com.ashera.widget.IListener{
private IWidget w; private View view; private String strValue; private String action;
public String getAction() {return action;}
public OnCheckedStateChangeListener(IWidget w, String strValue)  {
this.w = w; this.strValue = strValue;
}
public OnCheckedStateChangeListener(IWidget w, String strValue, String action)  {
this.w = w; this.strValue = strValue;this.action=action;
}
public void onCheckedChanged(ChipGroup group,List<Integer> checkedIds){
    
	if (action == null || action.equals("onCheckedChanged")) {
		// populate the data from ui to pojo
		w.syncModelFromUiToPojo("onCheckedChanged");
	    java.util.Map<String, Object> obj = getOnCheckedChangedEventObj(group,checkedIds);
	    String commandName =  (String) obj.get(EventExpressionParser.KEY_COMMAND_NAME);
	    
	    // execute command based on command type
	    String commandType = (String)obj.get(EventExpressionParser.KEY_COMMAND_TYPE);
		switch (commandType) {
		case "+":
		    if (EventCommandFactory.hasCommand(commandName)) {
		    	 EventCommandFactory.getCommand(commandName).executeCommand(w, obj, group,checkedIds);
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

public java.util.Map<String, Object> getOnCheckedChangedEventObj(ChipGroup group,List<Integer> checkedIds) {
	java.util.Map<String, Object> obj = com.ashera.widget.PluginInvoker.getJSONCompatMap();
    obj.put("action", "action");
    obj.put("eventType", "checkedchanged");
    obj.put("fragmentId", w.getFragment().getFragmentId());
    obj.put("actionUrl", w.getFragment().getActionUrl());
    obj.put("namespace", w.getFragment().getNamespace());
    
    if (w.getComponentId() != null) {
    	obj.put("componentId", w.getComponentId());
    }
    
    PluginInvoker.putJSONSafeObjectIntoMap(obj, "id", w.getId());
     
        PluginInvoker.putJSONSafeObjectIntoMap(obj, "checkedIds", checkedIds);
        ViewImpl.addEventInfo(obj, checkedIds, w.getFragment());
    
    // parse event info into the map
    EventExpressionParser.parseEventExpression(strValue, obj);
    
    // update model data into map
    w.updateModelToEventMap(obj, "onCheckedChanged", (String)obj.get(EventExpressionParser.KEY_EVENT_ARGS));
    return obj;
}
}


	@Override
	public void setId(String id){
		if (id != null && !id.equals("")){
			super.setId(id);
			chipGroup.setId((int) quickConvert(id, "id"));
		}
	}
	
    

		//end - body
	//start - codecopy
	private ChipGroup.OnCheckedStateChangeListener onCheckedStateChangeListener;
	private void setOnCheckedStateChange(Object objValue) {
		
		if (objValue instanceof String) {
			onCheckedStateChangeListener = new OnCheckedStateChangeListener(this, (String) objValue);
			chipGroup.setOnCheckedStateChangeListener(onCheckedStateChangeListener);
		} else {
			onCheckedStateChangeListener = (ChipGroup.OnCheckedStateChangeListener) objValue;
			chipGroup.setOnCheckedStateChangeListener(onCheckedStateChangeListener);
		}
		
	}
	
	
	private void checkMultiple(Object objValue) {
		if (onCheckedStateChangeListener != null) {
			chipGroup.setOnCheckedStateChangeListener(null);
		}
		int[]  ids = (int[]) objValue;
		
		for (Object id : ids) {
			chipGroup.check((int) id);
		}
		
		if (onCheckedStateChangeListener != null) {
			chipGroup.setOnCheckedStateChangeListener(onCheckedStateChangeListener);
			onCheckedStateChangeListener.onCheckedChanged(chipGroup, chipGroup.getCheckedChipIds());
		}
	}
	
	private void clearCheck() {
		chipGroup.clearCheck();
	}

	private void uncheck(Object objValue) {
		if (onCheckedStateChangeListener != null) {
			chipGroup.setOnCheckedStateChangeListener(null);
		}
		List<Integer> checkedChipIds = new java.util.ArrayList(chipGroup.getCheckedChipIds());
		checkedChipIds.remove((Integer) objValue);
		chipGroup.clearCheck();
		for (Object id : checkedChipIds) {
			chipGroup.check((int) id);
		}
		
		if (onCheckedStateChangeListener != null) {
			chipGroup.setOnCheckedStateChangeListener(onCheckedStateChangeListener);
			onCheckedStateChangeListener.onCheckedChanged(chipGroup, chipGroup.getCheckedChipIds());
		}
	}
	
	
	private void addChip(Object id, Object text, Object chipParams) {
		for (IWidget child : widgets) {
			if (child.getId().equals(id)) {
				return;
			}
		}
		
		IWidget chip = WidgetFactory.createWidget(ChipImpl.LOCAL_NAME, ChipImpl.LOCAL_NAME, this, false);
		chip.setAttribute("text", text, true);
		chip.setId((String) id);
		chip.setAttribute("id", id, false);
		Map<String, Object> chipParamsCss = com.ashera.model.ModelExpressionParser.parseSimpleCssExpression((String) chipParams);
		
		for (String key : chipParamsCss.keySet()) {
			chip.setAttribute(key, chipParamsCss.get(key), false);
		}
	}
	
	
	private void removeChip(Object id) {
		for (IWidget child : widgets) {
			if (child.getId().equals(id)) {
				remove(child);
				break;
			}
		}
		
	}
	//end - codecopy
}
