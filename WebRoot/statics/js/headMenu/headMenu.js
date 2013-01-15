Ext.onReady(function() {

	Ext.QuickTips.init();

	var tree = new Ext.tree.Panel({
		        region:'west',
		        title: '菜单',
		        split: true,
		        height: 500,
		        minSize: 150,
		        rootVisible: true,
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
							text : 'Service Units',
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
            if(record.getId() == 'ten'){
            	store.load();
            }
        }
    });

	var layoutExamples = [];
    Ext.Object.each(getBasicLayouts(), function(name, example) {
        layoutExamples.push(example);
    });
    
    Ext.Object.each(getCustomLayouts(), function(name, example){
        layoutExamples.push(example);
    });
    
    Ext.Object.each(getTenant(), function(name, example){
    	
    	//alert(example);
        layoutExamples.push(example);
    });
    
    Ext.Object.each(getDataBase(), function(name, example){
    	
    	//alert(example);
        layoutExamples.push(example);
    });
    Ext.Object.each(getApplication(), function(name, example){
    	
    //	alert(example);
        layoutExamples.push(example);
    });
    
    
    var contentPanel = {
            id: 'content-panel',
            region: 'center', // this is what makes this panel into a region within the containing layout
            layout: 'card',
            margins: '2 5 5 0',
            activeItem: 0,
            border: false,
            items : layoutExamples
       };
    
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
	
});

var store;
function getTenant() { 
	
	
	Ext.define('Tenant', {
	    extend: 'Ext.data.Model',
	    fields: [
		{
			name : 'id',
			type : 'long'
		}/*,{
	        name: 'cid',
	        type : 'long'
	    }, {
	    	name: 'dbi_id',
	        type : 'long'
	    }, {
	    	name: 'name',
	    	type : 'String'
	    }, {
	    	name: 'description',
	    	type : 'String'
	    }, {
	    	name: 'monitor_status',
	    	type : 'String'
	    }, {
	    	name: 'Version',
	    	type : 'String'
	    }, {
	    	name: 'lc_status',
	    	type : 'String'
	    }, {
	    	name: 'usage',
	    	type : 'String'
	    }, {
	    	name: 'connection_user_password',
	    	type : 'String'
	    }, {
	    	name: 'created_by',
	    	type : 'String'
	    }, {
	    	name: 'created_on',
	        type : 'String'
	    },{
	    	name : 'last_changed_by', 
	    	type : 'String'
	     },{
	    	name : 'last_changed_on', 
	    	type : 'String'
	    }*/]
	});
	
	
    
    store = new Ext.data.Store({
    	model: 'Tenant',
    	proxy: {
            //异步获取数据，这里的URL可以改为任何动态页面，只要返回JSON数据即可
             type: 'ajax',
             url: 'http://127.0.0.1:8080/mcSLD/tenant/getTenant!getAllTenant',
             
             reader: {
                 type: 'json',
                 root: 'root',
                 //totalProperty  : 'total'
             }
         }/*
         
         
         {
			name : 'id',
			mapping:'id',
			type : 'long'
		},{
	        name: 'cid',
	        mapping:'cid',
	        type : 'long'
	    }, {
	    	name: 'dbi_id',
	    	mapping:'dbi_id',
	        type : 'long'
	    }, {
	    	name: 'name',
	    	mapping:'description',
	    	type : 'String'
	    }, {
	    	name: 'description',
	    	mapping:'idescriptiond',
	    	type : 'String'
	    }, {
	    	name: 'monitor_status',
	    	mapping:'monitor_status',
	    	type : 'String'
	    }, {
	    	name: 'Version',
	    	mapping:'Version',
	    	type : 'String'
	    }, {
	    	name: 'lc_status',
	    	mapping:'lc_status',
	    	type : 'String'
	    }, {
	    	name: 'usage',
	    	mapping:'usage',
	    	type : 'String'
	    }, {
	    	name: 'connection_user_password',
	    	mapping:'connection_user_password',
	    	type : 'String'
	    }, {
	    	name: 'created_by',
	    	mapping:'created_by',
	    	type : 'String'
	    }, {
	    	name: 'created_on',
	    	mapping:'created_on',
	        type : 'String'
	    },{
	    	name : 'last_changed_by', 
	    	mapping:'last_changed_by',
	    	type : 'String'
	     },{
	    	name : 'last_changed_on', 
	    	mapping:'last_changed_on',
	    	type : 'String'
	    }
    	)*/,
        autoLoad: true
	});
    store.on('load',function(){alert(store.getCount());});
    
    var tengrid = Ext.create('Ext.grid.Panel', {
        store: store,
        id: 'ten-panel',
        columns: [{
        	header: "id",
        	dataIndex: "id"
        }/*{
            header: 'Name',
            dataIndex: 'name',
			width: 90,
        }, {
            header: 'Service Unit',
            dataIndex: 'Service Unit',
            width: 80,
        }, {
           // xtype: 'datecolumn',
            header: 'Version',
            dataIndex: 'Version',
            width: 80,
        }, {
           // xtype: 'numbercolumn',
            header: 'Storage',
            dataIndex: 'Storage',
           // format: '$0,0',
            width: 90,
        }, {
           // xtype: 'checkcolumn',
            header: 'Storage',
            dataIndex: 'Storage',
            width: 90,
        },{
		    text     : 'Active User', 
            width    : 85, 
            sortable : true, 
            dataIndex: 'Active User'
        },
		{
            
            text     : 'Remaining Days', 
            width    : w85, 
            sortable : true, 
            dataIndex: 'Remaining Days'
        },
		{
            text     : 'Monitor Status', 
            width    : 85, 
            sortable : true, 
            dataIndex: 'Monitor Status'
        }*/],
        renderTo: 'editor-grid',
        width: 600,
        height: 400,
        title: 'Tenants',
        frame: true,
        tbar: [{
            text: 'New',
            iconCls: 'employee-add',
        }, {
            text: 'Upgrade',
            iconCls: 'employee-edit',
			handler: function() {
                var sm = grid.getSelectionModel();
                rowEditing.cancelEdit();
                store.remove(sm.getSelection());
                if (store.getCount() > 0) {
                    sm.select(0);
                }
            },
			disabled: true
        }, {
            itemId: 'removeEmployee',
            text: 'Delete',
            iconCls: 'employee-remove',
            handler: function() {
                var sm = grid.getSelectionModel();
                rowEditing.cancelEdit();
                store.remove(sm.getSelection());
                if (store.getCount() > 0) {
                    sm.select(0);
                }
            },
            disabled: true
        }],
        listeners: {
            'selectionchange': function(view, records) {
                this.down('#removeEmployee').setDisabled(!records.length);
            }
        }
    });
    
    //store.load();
    //alert(store.getCount());
    
    return {
    	
        grid :  tengrid
    };
}
