package com.ashera.chip;
// start - imports
import java.util.*;

import r.android.annotation.SuppressLint;
import r.android.content.Context;
import r.android.os.Build;
import r.android.view.*;
import r.android.widget.*;
import r.android.view.View.*;

import com.ashera.widget.BaseHasWidgets;

import r.android.annotation.SuppressLint;

import com.ashera.core.IFragment;
import com.ashera.widget.bus.*;
import com.ashera.converter.*;
import com.ashera.widget.bus.Event.*;
import com.ashera.widget.*;
import com.ashera.widget.IWidgetLifeCycleListener.*;
import com.ashera.layout.*;

import androidx.core.view.*;

import static com.ashera.widget.IWidget.*;
//end - imports
import r.android.content.res.ColorStateList;
import r.android.graphics.drawable.Drawable;

public class ChipImpl extends BaseHasWidgets {
	//start - body
	private Object pane;
	public final static String LOCAL_NAME = "com.google.android.material.chip.Chip"; 
	public final static String GROUP_NAME = "com.google.android.material.chip.Chip";
	private com.google.android.material.chip.Chip chip;
	

	
		@SuppressLint("NewApi")
		final static class Ellipsize extends AbstractEnumToIntConverter{
		private Map<String, Integer> mapping = new HashMap<>();
				{
				mapping.put("end",  0x3);
				mapping.put("middle",  0x2);
				mapping.put("none",  0x0);
				mapping.put("start",  0x1);
				}
		@Override
		public Map<String, Integer> getMapping() {
				return mapping;
				}

		@Override
		public Integer getDefault() {
				return 0;
				}
				}
	@Override
	public void loadAttributes(String localName) {
		ViewGroupImpl.register(localName);

		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("checkable").withType("boolean").withUiFlag(UPDATE_UI_REQUEST_LAYOUT_N_INVALIDATE));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("checkedIcon").withType("drawable").withUiFlag(UPDATE_UI_REQUEST_LAYOUT_N_INVALIDATE));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("checkedIconTint").withType("colorstate").withUiFlag(UPDATE_UI_REQUEST_LAYOUT_N_INVALIDATE));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("checkedIconVisible").withType("boolean").withUiFlag(UPDATE_UI_REQUEST_LAYOUT_N_INVALIDATE));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("chipBackgroundColor").withType("colorstate").withUiFlag(UPDATE_UI_REQUEST_LAYOUT_N_INVALIDATE));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("chipCornerRadius").withType("dimensionfloat").withUiFlag(UPDATE_UI_REQUEST_LAYOUT_N_INVALIDATE));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("chipEndPadding").withType("dimensionfloat").withUiFlag(UPDATE_UI_REQUEST_LAYOUT_N_INVALIDATE));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("chipIcon").withType("drawable").withUiFlag(UPDATE_UI_REQUEST_LAYOUT_N_INVALIDATE));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("chipIconSize").withType("dimensionfloat").withUiFlag(UPDATE_UI_REQUEST_LAYOUT_N_INVALIDATE));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("chipIconTint").withType("colorstate").withUiFlag(UPDATE_UI_REQUEST_LAYOUT_N_INVALIDATE));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("chipIconVisible").withType("boolean").withUiFlag(UPDATE_UI_REQUEST_LAYOUT_N_INVALIDATE));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("chipMinHeight").withType("dimensionfloat").withUiFlag(UPDATE_UI_REQUEST_LAYOUT_N_INVALIDATE));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("chipStartPadding").withType("dimensionfloat").withUiFlag(UPDATE_UI_REQUEST_LAYOUT_N_INVALIDATE));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("chipStrokeColor").withType("colorstate").withUiFlag(UPDATE_UI_REQUEST_LAYOUT_N_INVALIDATE));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("chipStrokeWidth").withType("dimensionfloat").withUiFlag(UPDATE_UI_REQUEST_LAYOUT_N_INVALIDATE));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("closeIcon").withType("drawable").withUiFlag(UPDATE_UI_REQUEST_LAYOUT_N_INVALIDATE));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("closeIconEndPadding").withType("dimensionfloat").withUiFlag(UPDATE_UI_REQUEST_LAYOUT_N_INVALIDATE));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("closeIconSize").withType("dimensionfloat").withUiFlag(UPDATE_UI_REQUEST_LAYOUT_N_INVALIDATE));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("closeIconStartPadding").withType("dimensionfloat").withUiFlag(UPDATE_UI_REQUEST_LAYOUT_N_INVALIDATE));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("closeIconTint").withType("colorstate").withUiFlag(UPDATE_UI_REQUEST_LAYOUT_N_INVALIDATE));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("closeIconVisible").withType("boolean").withUiFlag(UPDATE_UI_REQUEST_LAYOUT_N_INVALIDATE));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("ensureMinTouchTargetSize").withType("boolean").withUiFlag(UPDATE_UI_REQUEST_LAYOUT_N_INVALIDATE));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("iconEndPadding").withType("dimensionfloat").withUiFlag(UPDATE_UI_REQUEST_LAYOUT_N_INVALIDATE));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("iconStartPadding").withType("dimensionfloat").withUiFlag(UPDATE_UI_REQUEST_LAYOUT_N_INVALIDATE));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("textEndPadding").withType("dimensionfloat").withUiFlag(UPDATE_UI_REQUEST_LAYOUT_N_INVALIDATE));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("textStartPadding").withType("dimensionfloat").withUiFlag(UPDATE_UI_REQUEST_LAYOUT_N_INVALIDATE));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("maxWidth").withType("dimension").withUiFlag(UPDATE_UI_REQUEST_LAYOUT_N_INVALIDATE));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("checked").withType("boolean").withUiFlag(UPDATE_UI_REQUEST_LAYOUT_N_INVALIDATE));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("text").withType("resourcestring").withUiFlag(UPDATE_UI_REQUEST_LAYOUT_N_INVALIDATE));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("onCheckedChange").withType("string").withUiFlag(UPDATE_UI_REQUEST_LAYOUT_N_INVALIDATE));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("onCloseIconClick").withType("string").withUiFlag(UPDATE_UI_REQUEST_LAYOUT_N_INVALIDATE));
		ConverterFactory.register("com.google.android.material.chip.Chip.ellipsize", new Ellipsize());
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("ellipsize").withType("com.google.android.material.chip.Chip.ellipsize"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("textAppearance").withType("string").withStylePriority(1));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("rippleColor").withType("colorstate"));
	
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

	@Override
	public IWidget newInstance() {
		return new ChipImpl(groupName, localName);
	}
	
	@SuppressLint("NewApi")
	@Override
	public void create(IFragment fragment, Map<String, Object> params) {
		super.create(fragment, params);
		chip = new ChipExt();
		
		nativeCreate(params);
		
		
		ViewGroupImpl.registerCommandConveter(this);
nativePostCreate();
	}

	@Override
	public Object asWidget() {
		return chip;
	}

	@Override
	public boolean remove(IWidget w) {
		boolean remove = super.remove(w);
		chip.removeView((View) w.asWidget());
		 nativeRemoveView(w);            
		return remove;
	}
	
	@Override
    public boolean remove(int index) {
		IWidget widget = widgets.get(index);
        boolean remove = super.remove(index);

        if (index + 1 <= chip.getChildCount()) {
            chip.removeViewAt(index);
            nativeRemoveView(widget);
        }    
        return remove;
    }

	private void nativeRemoveView(IWidget widget) {
		r.android.animation.LayoutTransition layoutTransition = chip.getLayoutTransition();
		if (layoutTransition != null && (
				layoutTransition.isTransitionTypeEnabled(r.android.animation.LayoutTransition.CHANGE_DISAPPEARING) ||
				layoutTransition.isTransitionTypeEnabled(r.android.animation.LayoutTransition.DISAPPEARING)
				)) {
			addToBufferedRunnables(() -> ViewGroupImpl.nativeRemoveView(widget));          
		} else {
			ViewGroupImpl.nativeRemoveView(widget);
		}
	}
	
	@Override
	public void add(IWidget w, int index) {
		if (index != -2) {
			View view = (View) w.asWidget();
			createLayoutParams(view);
			    if (index == -1) {
			        chip.addView(view);
			    } else {
			        chip.addView(view, index);
			    }
		}
		
		ViewGroupImpl.nativeAddView(asNativeWidget(), w.asNativeWidget());
		super.add(w, index);
	}
	
	private void createLayoutParams(View view) {
		com.google.android.material.chip.Chip.LayoutParams layoutParams = (com.google.android.material.chip.Chip.LayoutParams) view.getLayoutParams();
		
		layoutParams = (com.google.android.material.chip.Chip.LayoutParams) view.getLayoutParams();
		if (layoutParams == null) {
			layoutParams = new com.google.android.material.chip.Chip.LayoutParams(-2, -2);
			view.setLayoutParams(layoutParams);
		}  else {
			layoutParams.height = -2;
			layoutParams.width = -2;
		}
	}
	
	private com.google.android.material.chip.Chip.LayoutParams getLayoutParams(View view) {
		return (com.google.android.material.chip.Chip.LayoutParams) view.getLayoutParams();		
	}
	
	@SuppressLint("NewApi")
	@Override
	public void setChildAttribute(IWidget w, WidgetAttribute key, String strValue, Object objValue) {
		View view = (View) w.asWidget();
		com.google.android.material.chip.Chip.LayoutParams layoutParams = getLayoutParams(view);
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
		com.google.android.material.chip.Chip.LayoutParams layoutParams = getLayoutParams(view);

		switch (key.getAttributeName()) {
		case "layout_width":
			return layoutParams.width;
		case "layout_height":
			return layoutParams.height;
		}
		
		return null;

	}
	
		
	public class ChipExt extends com.google.android.material.chip.Chip implements ILifeCycleDecorator, com.ashera.widget.IMaxDimension{
		private MeasureEvent measureFinished = new MeasureEvent();
		private OnLayoutEvent onLayoutEvent = new OnLayoutEvent();
		private List<IWidget> overlays;
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

		public ChipExt() {
			super();
			
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
			ViewImpl.setDrawableBounds(ChipImpl.this, l, t, r, b);
			if (!isOverlay()) {
			ViewImpl.nativeMakeFrame(asNativeWidget(), l, t, r, b);
			}
			replayBufferedEvents();
	        ViewImpl.redrawDrawables(ChipImpl.this);
	        overlays = ViewImpl.drawOverlay(ChipImpl.this, overlays);
			
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
		public void execute(String method, Object... canvas) {
			
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
        private Map<String, IWidget> templates;
    	@Override
    	public r.android.view.View inflateView(java.lang.String layout) {
    		if (templates == null) {
    			templates = new java.util.HashMap<String, IWidget>();
    		}
    		IWidget template = templates.get(layout);
    		if (template == null) {
    			template = (IWidget) quickConvert(layout, "template");
    			templates.put(layout, template);
    		}
    		
    		IWidget widget = template.loadLazyWidgets(ChipImpl.this);
			return (View) widget.asWidget();
    	}   
        
    	@Override
		public void remeasure() {
    		if (getFragment() != null) {
    			getFragment().remeasure();
    		}
		}
    	
        @Override
		public void removeFromParent() {
        	ChipImpl.this.getParent().remove(ChipImpl.this);
		}
        @Override
        public void getLocationOnScreen(int[] appScreenLocation) {
        	org.eclipse.swt.widgets.Control control = (org.eclipse.swt.widgets.Control) asNativeWidget();
			appScreenLocation[0] = control.toDisplay(0, 0).x;
        	appScreenLocation[1] = control.toDisplay(0, 0).y;
        }
        @Override
        public void getWindowVisibleDisplayFrame(r.android.graphics.Rect displayFrame){
        	org.eclipse.swt.widgets.Shell shell = ((org.eclipse.swt.widgets.Control)asNativeWidget()).getShell();
        	displayFrame.left = shell.toDisplay(0, 0).x ;
			displayFrame.top = shell.getShell().toDisplay(0, 0).y ;
        	displayFrame.bottom = displayFrame.top + shell.getClientArea().height;
        	displayFrame.right = displayFrame.left + shell.getBounds().width;
        	
        }
        @Override
		public void offsetTopAndBottom(int offset) {
			super.offsetTopAndBottom(offset);
			ViewImpl.nativeMakeFrame(asNativeWidget(), getLeft(), getTop(), getRight(), getBottom());
		}
		@Override
		public void offsetLeftAndRight(int offset) {
			super.offsetLeftAndRight(offset);
			ViewImpl.nativeMakeFrame(asNativeWidget(), getLeft(), getTop(), getRight(), getBottom());
		}
		@Override
		public void setMyAttribute(String name, Object value) {
			if (name.equals("state0")) {
				setState0(value);
				return;
			}
			if (name.equals("state1")) {
				setState1(value);
				return;
			}
			if (name.equals("state2")) {
				setState2(value);
				return;
			}
			if (name.equals("state3")) {
				setState3(value);
				return;
			}
			if (name.equals("state4")) {
				setState4(value);
				return;
			}
			ChipImpl.this.setAttribute(name, value, !(value instanceof String));
		}
        @Override
        public void setVisibility(int visibility) {
            super.setVisibility(visibility);
            org.eclipse.swt.widgets.Control control = ((org.eclipse.swt.widgets.Control)asNativeWidget());
            if (!control.isDisposed()) {
            	control.setVisible(View.VISIBLE == visibility);
            }
            
        }
        
    	public void setState0(Object value) {
    		ViewImpl.setState(ChipImpl.this, 0, value);
    	}
    	public void setState1(Object value) {
    		ViewImpl.setState(ChipImpl.this, 1, value);
    	}
    	public void setState2(Object value) {
    		ViewImpl.setState(ChipImpl.this, 2, value);
    	}
    	public void setState3(Object value) {
    		ViewImpl.setState(ChipImpl.this, 3, value);
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
     
		@Override
		public void endViewTransition(r.android.view.View view) {
			super.endViewTransition(view);
			runBufferedRunnables();
		}
	
	}
	@Override
	public Class getViewClass() {
		return ChipExt.class;
	}
	
	@SuppressLint("NewApi")
	@Override
	public void setAttribute(WidgetAttribute key, String strValue, Object objValue, ILifeCycleDecorator decorator) {
		objValue = preSetAttribute(key, strValue, objValue, decorator);		ViewGroupImpl.setAttribute(this,  key, strValue, objValue, decorator);
		Object nativeWidget = asNativeWidget();
		switch (key.getAttributeName()) {
			case "checkable": {


	chip.setCheckable((boolean)objValue);



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
			case "textEndPadding": {


	chip.setTextEndPadding((float)objValue);



			}
			break;
			case "textStartPadding": {


	chip.setTextStartPadding((float)objValue);



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
			case "ellipsize": {


		 chip.setEllipsize(strValue);



			}
			break;
			case "textAppearance": {


		chip.setTextAppearance(strValue);



			}
			break;
			case "rippleColor": {


		setRippleColor(objValue);



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
			case "checkedIcon": {
return chip.getCheckedIcon();			}
			case "checkedIconTint": {
return chip.getCheckedIconTint();			}
			case "chipBackgroundColor": {
return chip.getChipBackgroundColor();			}
			case "chipCornerRadius": {
return chip.getChipCornerRadius();			}
			case "chipEndPadding": {
return chip.getChipEndPadding();			}
			case "chipIcon": {
return chip.getChipIcon();			}
			case "chipIconTint": {
return chip.getChipIconTint();			}
			case "chipMinHeight": {
return chip.getChipMinHeight();			}
			case "chipStartPadding": {
return chip.getChipStartPadding();			}
			case "chipStrokeColor": {
return chip.getChipStrokeColor();			}
			case "chipStrokeWidth": {
return chip.getChipStrokeWidth();			}
			case "closeIcon": {
return chip.getCloseIcon();			}
			case "closeIconEndPadding": {
return chip.getCloseIconEndPadding();			}
			case "closeIconSize": {
return chip.getCloseIconSize();			}
			case "closeIconStartPadding": {
return chip.getCloseIconStartPadding();			}
			case "closeIconTint": {
return chip.getCloseIconTint();			}
			case "ensureMinTouchTargetSize": {
return chip.shouldEnsureMinTouchTargetSize();			}
			case "iconEndPadding": {
return chip.getIconEndPadding();			}
			case "iconStartPadding": {
return chip.getIconStartPadding();			}
			case "textEndPadding": {
return chip.getTextEndPadding();			}
			case "textStartPadding": {
return chip.getTextStartPadding();			}
			case "rippleColor": {
return getRippleColor();			}
		}
		return null;
	}


	@Override
    public Object asNativeWidget() {
        return pane;
    }
    private void nativeCreate(Map<String, Object> params) {
        pane = new org.eclipse.swt.widgets.Composite((org.eclipse.swt.widgets.Composite)ViewImpl.getParent(this), getStyle(params, fragment));
        ((org.eclipse.swt.widgets.Composite)pane).setLayout(new org.eclipse.nebula.widgets.layout.AbsoluteLayout());
    }
    public boolean isWidgetDisposed() {
		return ((org.eclipse.swt.widgets.Control) pane).isDisposed();
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
	public void setId(String id){
		if (id != null && !id.equals("")){
			super.setId(id);
			chip.setId((int) quickConvert(id, "id"));
		}
	}
	
    
    @Override
    public void setVisible(boolean b) {
        ((View)asWidget()).setVisibility(b ? View.VISIBLE : View.GONE);
    }
    public int getStyle(String key, int initStyle, Map<String, Object> params, IFragment fragment) {
    	if (params == null) {
    		return initStyle;
    	}
    	Object style = params.get(key);
		if (style == null) {
			return initStyle;
		}
		int convertFrom = (int) ConverterFactory.get("swtbitflag").convertFrom(style.toString(), null, fragment);
		return convertFrom;
	}
	
	public int getStyle(Map<String, Object> params, IFragment fragment) {
		return getStyle("swtStyle", org.eclipse.swt.SWT.NONE, params, fragment);
	}
	
	public int getStyle(int initStyle, Map<String, Object> params, IFragment fragment) {
		return getStyle("swtStyle", initStyle, params, fragment);
	}

		//end - body
	private final static String WIDGET_TEXTVIEW = "CLabel";
	//start - codecopy
	private HasWidgets parentLL;
	private IWidget textWidget;
    private void nativePostCreate() {
        parentLL = (HasWidgets) WidgetFactory.createWidget(LinearLayoutImpl.LOCAL_NAME, LinearLayoutImpl.GROUP_NAME, this, false);
        parentLL.setAttribute("layout_width", "match_parent", false);
        
        IWidget iconWidget = WidgetFactory.createWidget("ImageView", "ImageView", parentLL, false);
        iconWidget.setAttribute("layout_width", "24dp", false);
        iconWidget.setAttribute("layout_height", "24dp", false);
        iconWidget.setVisible(false);
        
        IWidget checkboxWidget = WidgetFactory.createWidget("ImageView", "ImageView", parentLL, false);
        checkboxWidget.setAttribute("src", "@drawable/chip_icon_checked", false);
        checkboxWidget.setVisible(false);
        checkboxWidget.setAttribute("layout_width", "24dp", false);
        checkboxWidget.setAttribute("layout_height", "24dp", false);
        
        
		textWidget = WidgetFactory.createWidget(WIDGET_TEXTVIEW, "TextView", parentLL, false);
        textWidget.setAttribute("layout_width", "wrap_content", false);
        textWidget.setAttribute("layout_height", "32dp", false);
        textWidget.setAttribute("singleLine", "true", false);
        textWidget.setAttribute("layout_weight", "1", false);
        textWidget.setAttribute("paddingHorizontal", "8dp", false);
        textWidget.setAttribute("typeface", "sans", false);
        textWidget.setAttribute("textSize", "14sp", false);
        textWidget.setAttribute("gravity", "center_vertical", false);
        
        IWidget closeIconWidget = WidgetFactory.createWidget("ImageView", "ImageView", parentLL, false);
        closeIconWidget.setAttribute("src", "@drawable/chip_icon_close", false);
        closeIconWidget.setVisible(false);
        closeIconWidget.setAttribute("layout_width", "24dp", false);
        closeIconWidget.setAttribute("layout_height", "24dp", false);
        
        parentLL.setAttribute("background", "#fff", false);
        parentLL.setAttribute("gravity", "center", false);
        parentLL.setAttribute("layout_marginVertical", "16dp", false);
        chip.initView(parentLL, textWidget, iconWidget, checkboxWidget, closeIconWidget);
        
        chip.setChipCornerRadius(PluginInvoker.convertDpToPixel("16dp"));
    }
    
	private ColorStateList rippleColor;
	private int rippleRadius = 0;
	private void setRippleColor(Object value) {
		boolean addListener = this.rippleColor == null;
		this.rippleColor = (ColorStateList) value;

		if (addListener) {
			addRippleEffect();
		}
	}

	private Object getRippleColor() {
		return this.rippleColor;
	}


	private Object preSetAttribute(WidgetAttribute key, String strValue, Object objValue,
			ILifeCycleDecorator decorator) {
		switch (key.getAttributeName()) {
			case "onClick":{
				View.OnClickListener onClickListener;
				if (objValue instanceof String) {
					onClickListener = new OnClickListener(this, (String) objValue);
					chip.setChipClickListener(onClickListener);
					return null;
				}
			}
		}
		return objValue;
	}
    //end - codecopy
	private org.eclipse.swt.graphics.Point rippleOrigin;
	private void addRippleEffect() {
		org.eclipse.swt.widgets.Control control = ((org.eclipse.swt.widgets.Composite) textWidget.asNativeWidget()).getChildren()[0] ;
		addRippleEffect(control, (org.eclipse.swt.widgets.Composite)parentLL.asNativeWidget());
	}

	private void addRippleEffect(org.eclipse.swt.widgets.Control control, org.eclipse.swt.widgets.Composite clickControl) {
		org.eclipse.swt.widgets.Listener mouseListener = new org.eclipse.swt.widgets.Listener() {
            @Override
            public void handleEvent(org.eclipse.swt.widgets.Event event) {
            	if (event.widget == control) {
            		rippleOrigin = new org.eclipse.swt.graphics.Point(event.x, event.y);
            	} else {
            		rippleOrigin = control.getDisplay().map((org.eclipse.swt.widgets.Control) event.widget, clickControl, event.x, event.y);
            	}
            	rippleRadius = 0;
            	control.redraw();
            }
        };
        clickControl.addListener(org.eclipse.swt.SWT.MouseDown, mouseListener);
        for (org.eclipse.swt.widgets.Control clickControlChild : clickControl.getChildren()) {
        	clickControlChild.addListener(org.eclipse.swt.SWT.MouseDown, mouseListener);
        	
        	if (clickControlChild instanceof org.eclipse.swt.widgets.Composite)
        	for (org.eclipse.swt.widgets.Control clickControlChildChild : ((org.eclipse.swt.widgets.Composite) clickControlChild).getChildren()) {
        		clickControlChildChild.addListener(org.eclipse.swt.SWT.MouseDown, mouseListener);
        	}
		}

		org.eclipse.swt.widgets.Listener paintListener = new org.eclipse.swt.widgets.Listener() {
            @Override
            public void handleEvent(org.eclipse.swt.widgets.Event event) {
                org.eclipse.swt.graphics.GC gc = event.gc;
                Object color = rippleColor;
                if (rippleOrigin != null) {
                    gc.setAlpha(100);
                    if (color instanceof ColorStateList) {
                    	color = ((ColorStateList) color).getColorForState(((View) parentLL.asWidget()).getDrawableState(), r.android.graphics.Color.BLACK);
                    }
                    gc.setForeground((org.eclipse.swt.graphics.Color) ViewImpl.getColor(color));
                    gc.drawOval(rippleOrigin.x - rippleRadius, rippleOrigin.y - rippleRadius, 
                                2 * rippleRadius, 2 * rippleRadius);
                    rippleRadius += 5;
                    if (rippleRadius > control.getBounds().width) {
                        rippleOrigin = null;
                    }
                    control.getDisplay().timerExec(50, new Runnable() {
                        @Override
                        public void run() {
                        	control.redraw();
                        }
                    });
                }
            }
        };
		control.addListener(org.eclipse.swt.SWT.Paint, paintListener);
	}

}
