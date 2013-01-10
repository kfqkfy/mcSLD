Ext.onReady(function() {

	Ext.QuickTips.init();

	var tree = new Ext.tree.Panel({
		        region:'north',
		        title: '菜单',
		        split: true,
		        height: 500,
		        minSize: 150,
		        rootVisible: false,
		        autoScroll: true,
				root : {
					nodeType : 'async',
					text : 'SLD',
					draggable : false,
					id : '1',
					children : [{
						text : 'Company Managment',
						id : 'cm',
						leaf : false,
						children : [{
							text : 'Tenants',
							id : 'ten',
							leaf : true
						}]
					},{
						text : 'Landscape Managment',
						id : 'lm',
						children : [{
							text : 'Servuce Units',
							id : 'su',
							leaf : true
						},{
							text : 'Database Instances',
							id : 'di',
							leaf : true
						},{
							text : 'Application Instances',
							id : 'ai',
							leaf : true
						}]	
					}] 
						
				}
			});
	
	tree.getSelectionModel().on('select', function(selModel, record) {
        if (record.get('leaf')) {
            Ext.getCmp('content-panel').layout.setActiveItem(record.getId() + '-panel');
        }
    });

	//var src = imgUrl + "/image/login/homeCopy.png";
	
	
    // This is the Details panel that contains the description for each example layout.
//    var detailsPanel = {
//        id: 'details-panel',
//        title: 'Details',
//        region: 'center',
//        bodyStyle: 'padding-bottom:15px;background:#eee;',
//        autoScroll: true,
//        html: '<p class="details-info">When you select a layout from the tree, additional details will display here.</p>'
//    };
    
//    var layoutExamples = [];
	
	var layoutExamples = [];
//    Ext.Object.each(getBasicLayouts(), function(name, example) {
//        layoutExamples.push(example);
//    });
    
//    Ext.Object.each(getCustomLayouts(), function(name, example){
//        layoutExamples.push(example);
//    });
    
    var contentPanel = {
            id: 'content-panel',
            region: 'center', // this is what makes this panel into a region within the containing layout
            layout: 'card',
            margins: '2 5 5 0',
            activeItem: 0,
            border: false,
            items:[{
                id: 'ai-panel',
                title: 'Absolute Layout',
                layout: 'absolute',
                defaults: {
                    bodyStyle: 'padding:15px;',
                    width: 200,
                    height: 100,
                    frame: true
                },
                items:[{
                    title: 'Panel 1',
                    x: 150,
                    y: 150,
                    html: 'Positioned at x:50, y:50'
                },{
                    title: 'Panel 2',
                    x: 225,
                    y: 225,
                    html: 'Positioned at x:125, y:125'
                }]
            },{
                id: 'su-panel',
                title: 'Absolute Layout',
                layout: 'absolute',
                defaults: {
                    bodyStyle: 'padding:15px;',
                    width: 200,
                    height: 100,
                    frame: true
                },
                items:[{
                    title: 'Panel 1',
                    x: 50,
                    y: 50,
                    html: 'Positioned at x:50, y:50'
                },{
                    title: 'Panel 2',
                    x: 125,
                    y: 125,
                    html: 'Positioned at x:125, y:125'
                }]
            }]
       };
 
    // Finally, build the main layout once all the pieces are ready.  This is also a good
    // example of putting together a full-screen BorderLayout within a Viewport.
    Ext.create('Ext.Viewport', {
        layout: 'border',
        title: 'Ext Layout Browser',
        items: [{
            xtype: 'box',
            id: 'header',
            region: 'north',
            html: '<h1> OpenERP Cloud Management Center &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; Versions: 1.00.01</h1> ',
            height: 30
        },{
            layout: 'border',
            id: 'layout-browser',
            region:'west',
            border: false,
            split:true,
            margins: '2 0 5 5',
            width: 275,
            minSize: 100,
            maxSize: 500,
            items: [tree]
        }, 
            contentPanel
        ],
        renderTo: Ext.getBody()
    });
	
	
	
	

//	var src =  "/login/loginAction!homeCenter.jspa";

//	var viewport = new Ext.Viewport({
//		layout : 'fit',
//		items : [{
//			region : "north",
//			border : false,
//			height : 89,
//			html : '<iframe id="headFrame" name="headFrame" frameborder="no" width="100%" scrolling="no" height="100%" />'
//		}, tree, {
//			region : 'center',
//			border : false,
//			autoScroll : true,
//			html : '<iframe id="mainRight" name="mainRight" frameborder="no" width="100%" height="100%"  />'
//		}]
//	});

//	tree.getRootNode().expand();

});